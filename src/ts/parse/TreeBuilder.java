package ts.parse;

import ts.Location;
import ts.Message;
import ts.tree.*;

import java.util.List;

/**
 * Provides static methods for building AST nodes.
 */
public class TreeBuilder
{

  /** Build a binary operator.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  op    the binary operator.
   *  @param  left  the left subtree.
   *  @param  right the right subtree.
   *  @return tree node for a binary operator.
   *  @see Binop
   */
  public static Expression buildBinaryOperator(final Location loc,
      final Binop op,
      final Expression left, final Expression right)
  {
    Message.log("TreeBuilder: Binop " + op.toString());

    return new BinaryOperator(loc, op, left, right);
  }

  /** Build a unary operator.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  op    the binary operator.
   *  @param  expression  the expression subtree.
   *  @return tree node for a binary operator.
   *  @see Unop
   */
  public static Expression buildUnaryOperator(final Location loc,
      final Unop op,
      final Expression expression)
  {
    Message.log("TreeBuilder: Unop " + op.toString());

    return new UnaryOperator(loc, op, expression);
  }

  /** Build an expression statement.
   *
   *  @param  loc  location in source code (file, line, column).
   *  @param  exp  expression subtree.
   *  @return tree node for an expression statement.
   */
  public static Statement buildExpressionStatement(final Location loc,
      final Expression exp)
  {
    Message.log("TreeBuilder: ExpressionStatement");
    return new ExpressionStatement(loc, exp);
  }

  /** Build an identifier expression.
   *
   *  @param  loc  location in source code (file, line, column).
   *  @param  name name of the identifier.
   *  @return tree node for an identififier.
   */
  public static Expression buildIdentifier(final Location loc,
      final String name)
  {
    Message.log("TreeBuilder: Identifier (" + name + ")");
    return new Identifier(loc, name);
  }

  /** Build a numeric literal expression. Converts the String for
   *  the value to a double.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  value value of the literal as a String.
   *  @return tree node for a numeric literal.
   */
  public static Expression buildNumericLiteral(final Location loc,
      final String value)
  {
    double d = 0.0;

    try {
      // handle hex inputs
      if (value.matches("0[xX][0-9a-fA-F]+")) {
        String hex = value.substring(2);
        d = Integer.parseInt(hex, 16);
      } else {
        d = Double.parseDouble(value);
      }
    } catch(NumberFormatException e) {
      Message.bug(loc, "numeric literal not parsable");
    }
    Message.log("TreeBuilder: NumericLiteral " + d);
    return new NumericLiteral(loc, d);
  }

  /** Build a print statement.
   *
   *  @param  loc  location in source code (file, line, column).
   *  @param  exp  expression subtree.
   *  @return tree node for a print statement.
   */
  public static Statement buildPrintStatement(final Location loc,
      final Expression exp)
  {
    Message.log("TreeBuilder: PrintStatement");
    return new PrintStatement(loc, exp);
  }

  /** Build the root node of the AST.
   *
   *  @param  loc  location in source code (file, line, column).
   *  @param  list list of statements for the program.
   *  @return tree node for the root of the AST.
   */
  public static Program buildProgram(final Location loc,
      final List<Statement> list)
  {
    Message.log("TreeBuilder: Program");
    return new Program(loc, list);
  }

  /** Build block node.
   *
   *  @param  loc  location in source code (file, line, column).
   *  @param  list list of statements for the block.
   *  @return tree node for the root of the block.
   */
  public static Statement buildBlock(final Location loc,
      final List<Statement> list)
  {
    Message.log("TreeBuilder: BlockStatement");
    return new Block(loc, list);
  }

  /** Build a if node.
   *
   *  @param  loc location in source code (file, line, column).
   *  @param  exp expression representing the conditional
   *  @param  s1 statement to execute on conditional true
   *  @param  s2 statement to execute on conditional false
   *  @return tree node for a if else statement.
   */
  public static Statement buildIfStatement(final Location loc,
      final Expression exp, final Statement s1, final Statement s2)
  {
    Message.log("TreeBuilder: IfStatement");
    return new IfStatement(loc, exp, s1, s2);
  }

  /** Build a while node.
   *
   *  @param  loc location in source code (file, line, column).
   *  @param  expression expression representing the conditional
   *  @param  statement statement to execute on conditional
   *  @return tree node for a while statement.
   */
  public static Statement buildWhileStatement(final Location loc,
      final Expression expression, final Statement statement)
  {
    Message.log("TreeBuilder: WhileStatement");
    return new WhileStatement(loc, expression, statement);
  }

  /** Build a control node.
   *
   *  @param  loc location in source code (file, line, column).
   *  @param  value string of the actuall control statement.
   *  @return tree node for a continue statement.
   */
  public static Statement buildControlStatement(final Location loc,
      final String value)
  {
    Message.log("TreeBuilder: ControlStatement");
    return new ControlStatement(loc, value);
  }

  /** Build a empty node .
   *
   *  @param  loc  location in source code (file, line, column).
   *  @return tree node for an empty statement.
   */
  public static Statement buildEmptyStatement(final Location loc)
  {
    Message.log("TreeBuilder: EmptyStatement");
    return new EmptyStatement(loc);
  }

  /** Build a Boolean literal expression.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  value value of the literal as a String.
   *  @return tree node for a numeric literal.
   */
  public static Expression buildBooleanLiteral(final Location loc,
      final String value)
  {
    Message.log("TreeBuilder: BooleanLiteral " + value);
    return new BooleanLiteral(loc, value);
  }

  /** Build a Null literal expression.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  value value of the literal as a String.
   *  @return tree node for a numeric literal.
   */
  public static Expression buildNullLiteral(final Location loc,
      final String value)
  {
    Message.log("TreeBuilder: NullLiteral " + value);
    return new NullLiteral(loc, value);
  }

  /** Build a string literal expression.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  value value of the literal as a String.
   *  @return tree node for a numeric literal.
   */
  public static Expression buildStringLiteral(final Location loc,
      final String value)
  {
    // need to strip off the doublequotes
    String v = value.substring(1, value.length() - 1);

    Message.log("TreeBuilder: StringLiteral " + v);
    return new StringLiteral(loc, v);
  }

  /** Build an object literal expression.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  propertyList list of key value pairs to add to the object.
   *  @return tree node for an object literal.
   */
  public static Expression buildObjectLiteral(final Location loc,
      final List<Expression> propertyList)
  {
    Message.log("TreeBuilder: ObjectLiteral");
    return new ObjectLiteral(loc, propertyList);
  }

  /** Build an property assignment expression.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  name  name of the property.
   *  @param  value value of the property.
   *  @return tree node for a property assignment.
   */
  public static Expression buildPropAssignment(final Location loc,
      final Expression name, final Expression value)
  {
    Message.log("TreeBuilder: PropertyAssigment");
    return new PropAssignment(loc, name, value);
  }

  /** Build an property access expression.
   *
   *  @param  loc   location in source code (file, line, column).
   *  @param  object  object name.
   *  @param  property name of the property to access
   *  @return tree node for a property access.
   */
  public static Expression buildPropAccess(final Location loc,
      final Expression object, final Expression property)
  {
    Message.log("TreeBuilder: PropertyAccess");
    return new PropAccess(loc, object, property);
  }

  /** Build a "var" statement.
   *
   *  @param  loc  location in source code (file, line, column).
   *  @param  name name of variable being declared.
   *  @return tree node for a var statement.
   */
  public static Statement buildVarStatement(final Location loc,
      final String name)
  {
    Message.log("TreeBuilder: VarStatement (" + name + ")");
    return new VarStatement(loc, name);
  }

  //
  // methods to detect "early" (i.e. semantic) errors
  //

  // helper function to detect "reference expected" errors and to
  // mark nodes that denote references as Lvals
  private static boolean producesReference(Node node)
  {
    if (node instanceof Identifier)
    {
      Identifier id = (Identifier) node;
      id.setIsLval();
      return true;
    } else if (node instanceof PropAccess) {
       return true;
    }
    return false;
  }

  /** Used to detect non-references on left-hand-side of assignment and
   *  also to mark identifier nodes as denoting Lvals (location rather
   *  than value).
   *
   *  @param  loc  location in source code (file, line, column).
   *  @param  node tree to be checked.
   */
  public static void checkAssignmentDestination(Location loc, Node node)
  {
    if (!producesReference(node))
    {
      Message.error(loc, "invalid left-hand side in assignment");
    }
  }

}
