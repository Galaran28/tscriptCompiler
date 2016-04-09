/**
 * Traverse an AST to generate Java code.
 *
 */

package ts.tree.visit;

import ts.Message;
import ts.Main;
import ts.tree.*;
import ts.tree.type.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Does a traversal of the AST to generate Java code to execute the program
 * represented by the AST.
 * <p>
 * Uses a static nested class, Encode.ReturnValue, for the type parameter.
 * This class contains two String fields: one for the temporary variable
 * containing the result of executing code for an AST node; one for the
 * code generated for the AST node.
 * <p>
 * The "visit" method is overloaded for each tree node type.
 */
public final class Encode extends TreeVisitorBase<Encode.ReturnValue>
{
  /**
   * Static nested class to represent the return value of the Encode methods.
   * Contains the following fields:
   * <ul>
   * <li> a String containing the result operand name
   * <li> a String containing the code to be generated
   * </ul>
   * Only expressions generate results, so the result operand name
   * will be null in other cases, such as statements.
   */
  static public class ReturnValue
  {
    /** the result operand name. */
    public String result;

    /** the code to be generated. */
    public String code;

    // initialize both fields
    private ReturnValue()
    {
      result = null;
      code = null;
    }

    /** Construct an encode return value for non-expressions.
     *
     *  @param code the code to be placed in the return value
     */
    public ReturnValue(final String code)
    {
      this();
      this.code = code;
    }

    /** Construct an encode return value for most expressions.
     *
     *  @param result the result operand code.
     *  @param code the code to be generated.
     */
    public ReturnValue(final String result, final String code)
    {
      this();
      this.result = result;
      this.code = code;
    }
  }

  // simple counter for expression temps
  private int nextTemp = 0;

  /** Initiate an encode traversal with the output indented two spaces and
   *  the increment indentation amount set to two spaces.
   */
  public Encode()
  {
    this(2, 2);
  }

  // code that needs to be inserted at the begining of the main class
  private ArrayList<String> preCode = new ArrayList<>();

  // initial indentation value
  private final int initialIndentation;

  // current indentation amount
  private int indentation;

  // how much to increment the indentation by at each level
  // using an increment of zero would mean no indentation
  private final int increment;

  // increase indentation by one level
  private void increaseIndentation()
  {
    indentation += increment;
  }

  // decrease indentation by one level
  private void decreaseIndentation()
  {
    indentation -= increment;
  }

  /** Initiate an encode traversal with the output indented by a specific
   *  amount and the increment indentation amount set to a specific amount.
   *
   *  @param initialIndentation the initial indentation amount.
   *  @param increment the increment indentation amount.
   */
  public Encode(final int initialIndentation, final int increment)
  {
    // setup indentation
    this.initialIndentation = initialIndentation;
    this.indentation = initialIndentation;
    this.increment = increment;
  }

  // generate a string of spaces for current indentation level
  private String indent()
  {
    String ret = "";
    for (int i = 0; i < indentation; i++)
    {
      ret += " ";
    }
    return ret;
  }

  /** Generate the main method signature.
   *  @return the main method signature.
   */
  public String mainMethodSignature()
  {
    return "public static void main(String args[])";
  }

  /** Generate and return prologue code for the main method body.
   *
   *  @param filename source filename.
   *  @return the prologue code for the main method body.
   */
  public String mainPrologue(String filename)
  {
    String ret = "";
    ret += indent() + "{\n";
    increaseIndentation();
    ret += indent() + "TSValue undefined = TSUndefined.value;\n";
    return ret;
  }

  /** Append code to the main prologue
   *
   *  @param code code snippet to insert.
   */
  public void insertAtStart(String code)
  {
    this.preCode.add(code);
  }

  /** Generate and return epilogue code for the main method body.
   *
   *  @return the epilogue code for the main method body.
   */
  public String mainEpilogue()
  {
    decreaseIndentation();
    String ret = "";
    ret += indent() + "}";
    return ret;
  }

  // return string for name of next expression temp
  private String getTemp()
  {
    String ret = "temp" + nextTemp;
    nextTemp += 1;
    return ret;
  }

  // given AST Type, return for the matching Java type
  private String getJavaType(Type type)
  {
    if (type.isNumberType())
    {
      return "double";
    }
    else if (type.isStringType())
    {
      return "String";
    }
    return "TSValue";
  }

  /** Visit a list of ASTs and generate code for each of them in order.
   *  Uses a wildcard for generality: list of Statements, list of Expressions,
   *  etc. Returns a list containing the generated code for each element
   *  of the input list.
   */
  @Override public List<Encode.ReturnValue> visitEach(final Iterable<?> nodes)
  {
    List<Encode.ReturnValue> ret = new ArrayList<Encode.ReturnValue>();

    for (final Object node : nodes)
    {
      ret.add(visitNode((Tree) node));
    }
    return ret;
  }

  /** Generate and return code for a unary operator. */
  @Override public Encode.ReturnValue visit(final UnaryOperator unaryOperator)
  {
    // generate code to evaluate the subtree
    Expression exp = unaryOperator.getExp();
    Encode.ReturnValue returnValue = visitNode(exp);
    String code = returnValue.code;
    String expResult = returnValue.result;

    //
    // now generate code to do the unary operator itself
    //

    // name of Java variable to receive the result value
    String result = getTemp();

    // try to do optimized code generation first
    final Unop op = unaryOperator.getOp();
    final Type type = unaryOperator.getType();
    final String opString = unaryOperator.getOpString();
    switch (op) {

      case SUB:
        // if the type of a subtree is not known now to be Number, then
        // need to make sure it will be converted to Number if necessary
        if (!exp.getType().isNumberType())
        {
          expResult = "TSValue.make(" + expResult +
            ").toNumber().getInternal()";
        }

        // generage a Java subtraction
        code += indent() + "double " + result + " = -(" + expResult + ");\n";
        return new Encode.ReturnValue(result, code);

      case LNOT:
        break;

      default:
        Message.bug("unexpected operator: " + opString);
    }

    //
    // if control reaches here then do unoptimized code generation
    //

    // one of the subtrees might be a Java value at run-time so
    // need to generate code that will convert it to a TSValue if necessary
    String methodName = getMethodNameForUnaryOperator(unaryOperator);
    code += indent() + "TSValue " + result + " = TSValue.make(" + expResult +
      ")." + methodName + "();\n";

    return new Encode.ReturnValue(result, code);
  }

  // support routine for handling unary operators
  private static String getMethodNameForUnaryOperator(
      final UnaryOperator opNode)
  {
    final Unop op = opNode.getOp();

    switch (op) {
      case SUB:
        return "unarysub";
      case LNOT:
        return "lnot";
      default:
        Message.bug("unexpected operator: " + opNode.getOpString());
    }
    // cannot reach
    return null;
  }

  /** Generate and return code for a binary operator. */
  @Override public Encode.ReturnValue visit(final BinaryOperator binaryOperator)
  {
    // generate code to evaluate left subtree
    Expression left = binaryOperator.getLeft();
    Encode.ReturnValue leftReturnValue = visitNode(left);
    String code = leftReturnValue.code;
    String leftResult = leftReturnValue.result;

    // generate code to evaluate right subtree
    Expression right = binaryOperator.getRight();
    if (right instanceof PropAssignment) {
      // assignment code needs the object refernce
      // this also implies that the leftResult is an TSObject
      String newResult = getTemp();
      code += indent() + "TSObject " + newResult +
        " = (TSObject) " + leftResult + ";\n";
      leftResult = newResult;
      ((PropAssignment)right).objectRef = leftResult;
    }
    Encode.ReturnValue rightReturnValue = visitNode(right);
    code += rightReturnValue.code;
    String rightResult = rightReturnValue.result;

    //
    // now generate code to do the binary operator itself
    //

    // name of Java variable to receive the result value
    String result = getTemp();

    // try to do optimized code generation first
    final Binop op = binaryOperator.getOp();
    final Type type = binaryOperator.getType();
    final String opString = binaryOperator.getOpString();
    switch (op) {

      case ADD:

        // if result type is Number then both operands are Numbers
        // so just perform Java add and leave result as a Java double
        if (type.isNumberType())
        {
          code += indent() + "double " + result + " = " + leftResult +
            " + " + rightResult + ";\n";
          return new Encode.ReturnValue(result, code);
        }

        // if result type is String, then one of the operands is a String
        // but the other might not be a String, and might even be Unknown
        if (type.isStringType())
        {
          // if the type of the subtree is known now to be Number, then
          // need to convert it to a TSString in order to get the
          // Javascript conversion of Number to String because the
          // conversion is different than the Java conversion of double
          // to String.
          if (left.getType().isNumberType())
          {
            leftResult = "TSNumber.create(" + leftResult + ")";
          }
          if (right.getType().isNumberType())
          {
            rightResult = "TSNumber.create(" + rightResult + ")";
          }

          // if the type of a subtree is not known now to be String, then
          // need to make sure it will be converted to String if necessary
          if (!left.getType().isStringType())
          {
            leftResult += ".toStr().getInternal()";
          }
          if (!right.getType().isStringType())
          {
            rightResult += ".toStr().getInternal()";
          }

          // generate code to do Java string concatentation
          code += indent() + "String " + result + " = " + leftResult +
            " + " + rightResult + ";\n";
          return new Encode.ReturnValue(result, code);
        }

        // otherwise need to do unoptimized code generation
        break;

      case SUB:

        // if the type of a subtree is not known now to be Number, then
        // need to make sure it will be converted to Number if necessary
        if (!left.getType().isNumberType())
        {
          leftResult = "TSValue.make(" + leftResult +
            ").toNumber().getInternal()";
        }
        if (!right.getType().isNumberType())
        {
          rightResult = "TSValue.make(" + rightResult +
            ").toNumber().getInternal()";
        }

        // generage a Java subtraction
        code += indent() + "double " + result + " = " + leftResult +
          " - " + rightResult + ";\n";
        return new Encode.ReturnValue(result, code);

      case ASSIGN:
        // Need to handle assignment of Number or String to a variable
        // of ambiguous type. Need to check type of right child against
        // type of left child.
        if (left.getType().isUnknownType() && !right.getType().isUnknownType())
        {
          // need to generate code to make a TSValue and then assign
          String rightResult2 = getTemp();
          code += indent() + "TSValue " + rightResult2 + " = TSValue.make(" +
            rightResult + ");\n";
          code += indent() + leftResult + " = " + rightResult2 + ";\n";
        } else {
          // otherwise types match so just do the assignment
          code += indent() + leftResult + " = " + rightResult + ";\n";
        }

        // and in either case return the value from the right child
        // which can be a Java type
        return new Encode.ReturnValue(rightResult, code);

      case MULTIPLY:

        // if the type of a subtree is not known now to be Number, then
        // need to make sure it will be converted to Number if necessary
        if (!left.getType().isNumberType())
        {
          leftResult = "TSValue.make(" + leftResult +
            ").toNumber().getInternal()";
        }
        if (!right.getType().isNumberType())
        {
          rightResult = "TSValue.make(" + rightResult +
            ").toNumber().getInternal()";
        }

        // now generate a Java multiply
        code += indent() + "double " + result + " = " + leftResult +
          " * " + rightResult + ";\n";
        return new Encode.ReturnValue(result, code);
      case DIVIDE:

        // if the type of a subtree is not known now to be Number, then
        // need to make sure it will be converted to Number if necessary
        if (!left.getType().isNumberType())
        {
          leftResult = "TSValue.make(" + leftResult +
            ").toNumber().getInternal()";
        }
        if (!right.getType().isNumberType())
        {
          rightResult = "TSValue.make(" + rightResult +
            ").toNumber().getInternal()";
        }

        // now generate a Java divide
        code += indent() + "double " + result + " = " + leftResult +
          " / " + rightResult + ";\n";
        return new Encode.ReturnValue(result, code);
      case LESSTHAN:
        break;
      case GREATERTHAN:
        break;
      case EQUALS:
        break;

      default:
        Message.bug("unexpected operator: " + opString);
    }

    //
    // if control reaches here then do unoptimized code generation
    //

    // one of the subtrees might be a Java value at run-time so
    // need to generate code that will convert it to a TSValue if necessary
    String methodName = getMethodNameForBinaryOperator(binaryOperator);
    code += indent() + "TSValue " + result + " = TSValue.make(" + leftResult +
      ")." + methodName + "(TSValue.make(" + rightResult + "));\n";

    return new Encode.ReturnValue(result, code);
  }

  // support routine for handling binary operators
  private static String getMethodNameForBinaryOperator(
      final BinaryOperator opNode)
  {
    final Binop op = opNode.getOp();

    switch (op) {
      case ADD:
        return "add";
      case SUB:
        return "sub";
      case MULTIPLY:
        return "multiply";
      case DIVIDE:
        return "divide";
      case GREATERTHAN:
        return "greaterthan";
      case LESSTHAN:
        return "lessthan";
      case EQUALS:
        return "equality";
      default:
        Message.bug("unexpected operator: " + opNode.getOpString());
    }
    // cannot reach
    return null;
  }

  /** Generate and return code for an expression statement. */
  @Override public Encode.ReturnValue visit(final ExpressionStatement
      expressionStatement)
  {
    Encode.ReturnValue exp = visitNode(expressionStatement.getExp());
    String code = indent() + "Message.setLineNumber(" +
      expressionStatement.getLineNumber() + ");\n";
    code += exp.code;
    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for an identifier. */
  @Override public Encode.ReturnValue visit(final Identifier identifier)
  {
    String result = null;
    String code = "";

    // info about the variable is stored in the VarStatement node
    // that declared it
    VarStatement varNode = identifier.getVarNode();

    // if there is no link back to the Var declaration then
    // the identifier is not declared
    if (varNode == null)
    {
      // if identifier is an lval then eventually we will need to insert
      // a property into the global object, but since we are not yet
      // implementing the global object, we need to treat this case as
      // an error, same as rval
      code += indent() + "Message.executionError(\"undefined identifier: " +
        identifier.getName() + "\");\n";

      // so that the Java code will compile, need to build a dummy result
      result = getTemp();
      code += indent() + "TSValue " + result + " = TSUndefined.value;\n";
    }
    // otherwise identifier is declared
    else
    {
      String codegenName = varNode.getTempName();
      Type type = varNode.getType();

      // does the identifier denote the address of a variable or its value?
      if (identifier.isLval())
      {
        // just need the variable's address (so no code needs to be generated)
        result = codegenName;
      }
      else
      {
        // need to deref the variable to get its value
        String jType = getJavaType(type);
        result = getTemp();
        code += indent() + jType + " " + result + " = " + codegenName + ";\n";
      }
    }

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a numeric literal. */
  @Override public Encode.ReturnValue visit(final NumericLiteral numericLiteral)
  {
    String result = getTemp();
    String code = indent() + "double " + result + " = " +
      numericLiteral.getValue() + ";\n";

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a print statement. */
  @Override public Encode.ReturnValue visit(final PrintStatement printStatement)
  {
    Type type = printStatement.getExp().getType();
    Encode.ReturnValue exp = visitNode(printStatement.getExp());
    String code = indent() + "Message.setLineNumber(" +
      printStatement.getLineNumber() + ");\n";
    code += exp.code;
    if (type.isNumberType())
    {
      // need to apply Javascript Number -> String conversion
      code += indent() + "System.out.println(TSNumber.create(" + exp.result +
        ").toStr().getInternal());\n";
    }
    else if (type.isStringType())
    {
      code += indent() + "System.out.println(" + exp.result + ");\n";
    }
    else
    {
      code += indent() + "System.out.println(" + exp.result +
        ".toPrimitive().toStr().getInternal());\n";
    }
    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for a program. */
  @Override public Encode.ReturnValue visit(final Program program)
  {
    String code = "";
    for (Encode.ReturnValue value : visitEach(program.getList()))
    {
      code += value.code;
    }

    // correct indentation on preCode and insert into the prologue
    String pre = "";
    for(String s : this.preCode) {
      pre += indent() + s + "\n";
    }
    code = pre + code;
    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for a block. */
  @Override public Encode.ReturnValue visit(final Block block)
  {
    String code = indent() + "{\n";
    increaseIndentation();

    for (Encode.ReturnValue value : visitEach(block.getList()))
    {
      code += value.code;
    }

    decreaseIndentation();
    code += indent() + "}\n";
    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for an empty statement . */
  @Override public Encode.ReturnValue visit(final EmptyStatement emptyStatement)
  {
    String code = indent() + "Message.setLineNumber(" +
      emptyStatement.getLineNumber() + ");\n";
    code = indent() +  ";\n";

    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for an if statement . */
  @Override public Encode.ReturnValue visit(final IfStatement ifStatement)
  {
    String code = indent() + "Message.setLineNumber(" +
      ifStatement.getLineNumber() + ");\n";

    // generate code to evaluate conditional tree
    Encode.ReturnValue expReturnValue = visitNode(ifStatement.getExp());
    code = expReturnValue.code;

    code += indent() + "if ( " +
      expReturnValue.result + ".toBoolean().getInternal() )\n";

    // generate code to evaluate true statement subtree
    if ((ifStatement.getTrue() instanceof Block)) {
      Encode.ReturnValue trueReturnValue = visitNode(ifStatement.getTrue());
      code += trueReturnValue.code;
    } else {
      code += indent() +"{\n";
      increaseIndentation();

      Encode.ReturnValue trueReturnValue = visitNode(ifStatement.getTrue());
      code += trueReturnValue.code;

      decreaseIndentation();
      code += indent() +"}\n";
    }

    // generate code to evaluate false statement subtree
    if (ifStatement.hasElse) {
      code += indent() + "else\n";
      if ((ifStatement.getFalse() instanceof Block)) {
        Encode.ReturnValue falseReturnValue = visitNode(ifStatement.getFalse());
        code += falseReturnValue.code;
      } else {
      code += indent() +"{\n";
        increaseIndentation();

        Encode.ReturnValue falseReturnValue = visitNode(ifStatement.getFalse());
        code += falseReturnValue.code;

        decreaseIndentation();
        code += indent() +"}\n";
      }
    }

    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for a while statement . */
  @Override public Encode.ReturnValue visit(final WhileStatement whileStatement)
  {
    // generate code to evaluate conditional tree
    Encode.ReturnValue conditional = visitNode(whileStatement.getLeft());
    String code = conditional.code;
    String conditionalResult = conditional.result;

    code += indent() + "while ( " +
      conditionalResult + ".toBoolean().getInternal() )\n";

    if (whileStatement.getRight() instanceof Block) {
      // generate code to evaluate statement subtree
      Encode.ReturnValue loop = visitNode(whileStatement.getRight());

      // delete "}\n"
     code += loop.code.substring(0, loop.code.length() - 2); // delete "}\n"

      increaseIndentation();
    } else {
      // create a new block
      code += indent() +"{\n";
    // set key:value pair in result

      increaseIndentation();

      // generate code to evaluate statement subtree
      code += visitNode(whileStatement.getRight()).code;
    }

    // generate code to update conditionalResult
    conditional = visitNode(whileStatement.getLeft());
    code += conditional.code;
    code += indent() + conditionalResult + " = " + conditional.result + ";\n";

    decreaseIndentation();
    code += indent() +"}\n";

    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for a control statement . */
  @Override public Encode.ReturnValue visit(final ControlStatement controlStatement)
  {
    String code = indent() + ControlStatement.statement + ";\n";

    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for a object literal . */
  @Override public Encode.ReturnValue visit(final ObjectLiteral object)
  {
    String result = getTemp();
    String code = indent() + "TSObject " + result + " = TSObject.create();\n";

    for (Expression e : object.getList()) {
      PropAssignment p = (PropAssignment) e;
      p.objectRef = result;
      Encode.ReturnValue pNode = visitNode(p);
      code += pNode.code;
    }

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a property assignment. */
  @Override public Encode.ReturnValue visit(final PropAssignment p)
  {
    Encode.ReturnValue name, value;
    name = visitNode(p.getName());
    value = visitNode(p.getValue());

    String code = name.code + value.code;

    code += indent() + p.objectRef + ".set("
      + "TSValue.make(" + name.result + ").toPrimitive().toStr().getInternal(), "
      + "TSValue.make(" + value.result + "));\n";

    return new Encode.ReturnValue(code);
  }

  /** Generate and return code for a property access. */
  @Override public Encode.ReturnValue visit(final PropAccess access)
  {
    // get code for left and right subtrees
    Encode.ReturnValue object = visitNode(access.getObject());
    Encode.ReturnValue prop = visitNode(access.getProp());

    String code = object.code;

    // the return will be a TSValue so it needs to be cast to a TSObject
    String objectResult = getTemp();
    code += indent() + "TSObject " + objectResult +
      " = (TSObject)" + object.result + ";\n";

    code += prop.code;

    // the property could be a Java type result so we generallize with .make()
    String result = getTemp();
    code += indent() + "TSValue " + result + " = " + objectResult + ".get("
      + "TSValue.make(" + prop.result + ").toPrimitive().toStr().getInternal()"
      + ");\n";

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a new expression. */
  @Override public Encode.ReturnValue visit(final NewExpression newExp)
  {
    Encode.ReturnValue expression = visitNode(newExp.getObject());
    String result = getTemp();
    String code = expression.code;
    code += indent() + "TSObject " + result + " = TSObject.create(" +
      expression.result + ");\n";

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a string literal. */
  @Override public Encode.ReturnValue visit(final StringLiteral stringLiteral)
  {
    String result = getTemp();
    String code = indent() + "String " + result + " = \"" +
      stringLiteral.getValue() + "\";\n";

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a boolean literal. */
  @Override public Encode.ReturnValue visit(final BooleanLiteral booleanLiteral)
  {
    String result = getTemp();
    String code = indent() + "TSBoolean " + result + " = " +
      "TSBoolean.create(" + booleanLiteral.getValue() + ");\n";

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a null literal. */
  @Override public Encode.ReturnValue visit(final NullLiteral nullLiteral)
  {
    String result = getTemp();
    String code = indent() + "TSValue " + result + " = " + "TSNull.value;\n";

    return new Encode.ReturnValue(result, code);
  }

  /** Generate and return code for a var statement. */
  @Override public Encode.ReturnValue visit(final VarStatement varStatement)
  {
    String tmp = "";
    // if this var node is redundant, then skip it
    if (varStatement.isRedundant())
    {
      return new Encode.ReturnValue("");
    }

    String code = indent() + "Message.setLineNumber(" +
      varStatement.getLineNumber() + ");\n";

    // if this variable was never used, then Type will be null.
    // in that case treat as if the type is unknown
    Type type = varStatement.getType();
    if (type == null || type.isUnknownType())
    {
      tmp =  indent() + "TSValue " + varStatement.getTempName() +
        " = TSUndefined.value;\n";
      code += tmp;
      // append to proluge since javascript declarations apply outside the block
      if (varStatement.getFunctionDepth() > 0) { insertAtStart(tmp.trim()); }
    }
    else
    {
      String jType = getJavaType(type);
      tmp = indent() + jType + " " + varStatement.getTempName() + ";\n";
      code += tmp;
      // append to proluge since javascript declarations apply outside the block
      if (varStatement.getFunctionDepth() > 0) { insertAtStart(tmp.trim()); }
    }

    return new Encode.ReturnValue(code);
  }

}

