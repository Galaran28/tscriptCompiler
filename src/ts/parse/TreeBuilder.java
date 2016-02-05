package ts.parse;

import ts.Location;
import ts.Message;
import ts.tree.*;

import java.util.List;

/**
 * Provides static methods for building AST nodes.
 */
//TODO: add booleanliteral builder
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

    try
    {
      d = Double.parseDouble(value);
    }
    catch(NumberFormatException nfe)
    {
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
