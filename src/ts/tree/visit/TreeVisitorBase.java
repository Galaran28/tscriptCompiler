
package ts.tree.visit;

import ts.tree.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Base implementation for AST visitors. Performs complete traversal
 * but does nothing. Parameterized by return value.
 * <p>
 * The "visit" method is overloaded for every tree node type.
 */
public class TreeVisitorBase<T> implements TreeVisitor<T>
{
  /** Called for every node. Override to add pre- and/or post-processing.
   *  @param node node to be visited.
   *  @return value generated by visitor.
   */
  protected T visitNode(final Tree node)
  {
    return node.apply(this);
  }

  /** Visit a list of ASTs and return a list of results.
   *  (Uses a wildcard to allow general use, with list of Statements, list
   *   of Expressions, etc.)
   *  @param nodes list to be visited.
   *  @return list of values generated by visitor.
   */
  protected List<T> visitEach(final Iterable<?> nodes)
  {
    final List<T> visited = new ArrayList<T>();
    for (final Object node : nodes)
    {
      visited.add(visitNode((Tree) node));
    }
    return visited;
  }

  /** Visit a BinaryOperator node. Override to provide specific behavior. */
  @Override public T visit(final BinaryOperator binaryOperator)
  {
    visitNode(binaryOperator.getLeft());
    visitNode(binaryOperator.getRight());
    return null;
  }

  /** Visit an ExpressionStatement node. Override to provide specific
   *  behavior.
   */
  @Override public T visit(final ExpressionStatement expressionStatement)
  {
    visitNode(expressionStatement.getExp());
    return null;
  }

  /** Visit an Identifier node. Override to provide specific behavior. */
  @Override public T visit(final Identifier identifier)
  {
    return null;
  }

  /** Visit a NumericLiteral node. Override to provide specific behavior. */
  @Override public T visit(final NumericLiteral numericLiteral)
  {
    return null;
  }

  /** Visit a PrintStatement node. Override to provide specific behavior. */
  @Override public T visit(final PrintStatement printStatement)
  {
    visitNode(printStatement.getExp());
    return null;
  }

  /** Visit a Program node. Override to provide specific behavior. */
  @Override public T visit(final Program program)
  {
    visitEach(program.getList());
    return null;
  }

  /** Visit a StringLiteral node. Override to provide specific behavior. */
  @Override public T visit(final StringLiteral stringLiteral)
  {
    return null;
  }

  /** Visit a BooleanLiteral node. Override to provide specific behavior. */
  @Override public T visit(final BooleanLiteral booleanLiteral)
  {
    return null;
  }

  /** Visit a VarStatement node. Override to provide specific behavior. */
  @Override public T visit(final VarStatement varStatement)
  {
    return null;
  }

}

