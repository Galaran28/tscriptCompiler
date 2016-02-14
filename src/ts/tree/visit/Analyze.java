
package ts.tree.visit;

import ts.Message;
import ts.Location;
import ts.tree.*;
import ts.tree.type.*;
import static ts.tree.Binop.*;
import ts.parse.TreeBuilder;

import java.util.Deque;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

/**
 * Analyze an AST. The goal is to do simple type inferencing and to
 * identify where variables will be stored at run-time. For now, they
 * they will be stored in a Java local, but later this code will need
 * to be updated to support variables captured by a closure, and global
 * variables stored as properties of the global object.
 * <p>
 * When the analyzer is created, a pass number is provided to the constructor,
 * which must be either 1 (first pass) or 2 (second pass). The first pass
 * connects Identifier nodes to the VarStatement nodes where the identifier
 * was declared. Information is accumulated in the VarStatement node about
 * the variable, including its function depth (how deeply nested is the
 * function that contains the declaration) and its type. A second pass is
 * needed because if the type is ambiguous for a variable, then its initial
 * uses may not reflect the ambiguous type that was found later. The expression
 * trees containing these Identifier nodes need to have their types updated
 * in the second pass.
 * <p>
 * Using Tree for the type parameter to allow subtrees to be altered
 * by visiting them. The return type can be assigned to the fields
 * of a node as the traversal returns back to it. This capability is
 * actually not being used, but it might be useful later.
 * <p>
 * The "visit" method is overloaded for each tree node type.
 */
public final class Analyze extends TreeVisitorBase<Tree>
{

  /** The symbol table. It is a map of variable names to stacks of
   *  VarStatement nodes.
   */
  private Map<String, Deque<VarStatement>> symbolTable;

  /** The current function declaration depth. Always zero now. */
  private int functionDepth = 0;

  /** The pass being implemented by this instance of the analyze visitor.
   *  Must be either 1 (first pass) or 2 (second pass).
   */
  private int pass;

  /** Create an AST analyzer.
   *
   *  @param pass pass number to be implemented by this analyze visitor,
   *              which must be either 1 (first pass) or 2 (second pass).
   */
  public Analyze(int pass)
  {
    if (pass < 1 || pass > 2)
    {
      throw new IllegalArgumentException("illegal pass number");
    }
    this.pass = pass;
    symbolTable = new HashMap<String,Deque<VarStatement>>();

    // insert prebuild undefined node into symbol table
    Deque<VarStatement> stack = new LinkedList<VarStatement>();
    VarStatement undefNode = (VarStatement) TreeBuilder.buildVarStatement(new Location("",0,0), "undefined");
    undefNode.setTempName("undefined");
    stack.add(undefNode);
    symbolTable.put("undefined", stack);
  }

  /** Visit a list of ASTs and dump them in order.
   */
  @Override public List<Tree> visitEach(final Iterable<?> nodes)
  {
    for (final Object node : nodes)
    {
      visitNode((Tree) node);
    }
    return null;
  }

  /** Analyze a binary operator. */
  @Override public Tree visit(final BinaryOperator binaryOperator)
  {
    // recurse left and then right
    binaryOperator.setLeft((Expression)visitNode(binaryOperator.getLeft()));
    binaryOperator.setRight((Expression)visitNode(binaryOperator.getRight()));

    // now do type analysis
    Binop op = binaryOperator.getOp();
    Type leftType = binaryOperator.getLeft().getType();
    Type rightType = binaryOperator.getRight().getType();

    switch (op)
    {
      case ADD:
        // if either operand is a string, then result is a string
        if (leftType.isStringType() || rightType.isStringType())
        {
          binaryOperator.setType(StringType.getInstance());
        }
        // if both are numbers, then result is number
        else if (leftType.isNumberType() && rightType.isNumberType())
        {
          binaryOperator.setType(NumberType.getInstance());
        }
        // otherwise can't tell now what result type will be
        else
        {
          binaryOperator.setType(UnknownType.getInstance());
        }
        break;
      case SUB:
        // always produces a number
        binaryOperator.setType(NumberType.getInstance());
        break;
      case ASSIGN:
        // type of the result is the type of the right-hand side
        binaryOperator.setType(rightType);
        // if the left-hand side is an identifier, then on pass 1
        // update its declaring VarStatement node (if there is one)
        if ((pass == 1) && (binaryOperator.getLeft() instanceof Identifier))
        {
          Identifier id = (Identifier) binaryOperator.getLeft();
          VarStatement node = id.getVarNode();
          // might not be declared
          if (node != null)
          {
            // update the type information recorded so far for variable
            Type oldType = node.getType();
            if (oldType == null)
            {
              // no type seen before
              node.setType(rightType);
            }
            else
            {
              // if old type does not match the current type, then
              // the type is ambigous
              if (!oldType.isSameType(rightType))
              {
                // so label the variable as having unknown type
                node.setType(UnknownType.getInstance());
              }
            }
          }
        }
        break;
      case MULTIPLY:
        // always produces a number
        binaryOperator.setType(NumberType.getInstance());
        break;
      default:
        Message.bug("unexpected binary operator");
    }

    // return this node so it can be re-assigned by its parent
    return binaryOperator;
  }

  /** Analyze an expression statement. */
  @Override public Tree visit(final ExpressionStatement expressionStatement)
  {
    visitNode(expressionStatement.getExp());
    return null;
  }

  /** Analyze an identifier. */
  @Override public Tree visit(final Identifier identifier)
  {
    // if it is the second pass then only need to copy the type from
    // the Var node.
    if (pass == 2)
    {
      VarStatement varNode = identifier.getVarNode();
      if (varNode == null)
      {
        // identifier is not defined, so set its type to unknown
        identifier.setType(UnknownType.getInstance());
      }
      else
      {
        Type type = varNode.getType();
        if (type == null)
        {
          // variable was never assigned so set the type to unknown
          identifier.setType(UnknownType.getInstance());
        }
        else
        {
          // otherwise use the type in the var node
          identifier.setType(type);
        }
      }
      // that is all we need to do for pass 2
      return identifier;
    }

    //
    // all the following code is only executed on pass 1
    //

    // lookup the name in the symbol table
    Deque<VarStatement> stack = symbolTable.get(identifier.getName());
    if (stack != null)
    {
      VarStatement varNode = stack.peekFirst();
      if (varNode != null)
      {
        // record the declaration tree node into the identifier tree node so
        // that code generator has access to what is learned about this
        // variable
        identifier.setVarNode(varNode);

        // check the type field of the Var node
        // if it is null, and the identifier represents an Rval, then
        // this is a use of the variable before it is assigned to, meaning
        // that it will contain the undefined value, so its type needs
        // to be set to Unknown, since the variable lifetime is not
        // always Number or always String
        if (varNode.getType() == null && !identifier.isLval())
        {
          varNode.setType(UnknownType.getInstance());
          identifier.setType(UnknownType.getInstance());
        }
        else
        {
          // otherwise set this type to be the type from the var node
          identifier.setType(varNode.getType());
        }
      }
      else
      {
        // identifier is not defined, so set its type to Unknown
        identifier.setType(UnknownType.getInstance());
      }
    }
    else
    {
      // identifier is not defined, so set its type to Unknown
      identifier.setType(UnknownType.getInstance());
    }

    // return the node so that it can be re-assigned by its parent
    return identifier;
  }

  /** Analyze a numeric literal. */
  @Override public Tree visit(final NumericLiteral numericLiteral)
  {
    // always has Number type
    numericLiteral.setType(NumberType.getInstance());

    // return the node so that it can be re-assigned by its parent
    return numericLiteral;
  }

  /** Analyze a print statement. */
  @Override public Tree visit(final PrintStatement printStatement)
  {
    visitNode(printStatement.getExp());
    return null;
  }

  /** Analyze a program. */
  @Override public Tree visit(final Program program)
  {
    visitEach(program.getList());
    return null;
  }

  /** Analyze a string literal. */
  @Override public Tree visit(final StringLiteral stringLiteral)
  {
    // always has String type
    stringLiteral.setType(StringType.getInstance());

    // return the node so that it can be re-assigned by its parent
    return stringLiteral;
  }

  /** Analyze a boolean literal. */
  @Override public Tree visit(final BooleanLiteral booleanLiteral)
  {
    // always has Unknown type
    booleanLiteral.setType(UnknownType.getInstance());

    // return the node so that it can be re-assigned by its parent
    return booleanLiteral;
  }

  /** Analyze a null literal. */
  @Override public Tree visit(final NullLiteral nullLiteral)
  {
    // always has Unknown type
    nullLiteral.setType(UnknownType.getInstance());

    // return the node so that it can be re-assigned by its parent
    return nullLiteral;
  }

  /** Analyze a var statement. */
  @Override public Tree visit(final VarStatement varStatement)
  {
    // there is nothing to do if this is pass 2
    if (pass == 2)
    {
      return null;
    }

    //
    // the following code is only executed on pass 1
    //

    // record the current function depth
    varStatement.setFunctionDepth(functionDepth);

    // generate a temp name to use at codegen time
    varStatement.setTempName("var_" + varStatement.getName() + "_" +
      functionDepth);

    // is there a stack for this name already in the symbol table?
    Deque<VarStatement> stack = symbolTable.get(varStatement.getName());
    if (stack == null)
    {
      // need to create the stack and insert it into the map
      stack = new LinkedList<VarStatement>();
      symbolTable.put(varStatement.getName(), stack);
    }

    // is there a declaration for this variable at the same function depth?
    // if so, then mark this declaration as redundant.
    VarStatement top = stack.peekFirst();
    if ((top != null) && (top.getFunctionDepth() == functionDepth))
    {
      varStatement.setIsRedundant();
    }
    // else push the current VarStatment onto the stack
    else
    {
      stack.addFirst(varStatement);
    }

    return null;
  }

}

