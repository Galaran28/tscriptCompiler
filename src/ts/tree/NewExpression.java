
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

/**
 * AST new expression node
 *
 */
public final class NewExpression extends Expression
{
  private Expression object;

  /** Construct a new expression tree node.
   *
   *  @param loc the source code location of the identifier.
   *  @param object object to use for prototype
   */
  public NewExpression(final Location loc, final Expression object)
  {
    super(loc);
    this.object = object;
  }

  /** Get the value of the new expression.
   *
   *  @return the expression represting the object prototype.
   */
  public Expression getObject()
  {
    return object;
  }

  /** Set the value of the new expression.
   *  @param object object to use for prototype
   */
  public void setObject(Expression object)
  {
    this.object = object;
  }

  /** Apply a visitor to the node.
   *
   *  @param visitor the visitor to apply.
   *
   *  @return the value generated by the visitor.
   */
  @Override public <T> T apply(TreeVisitor<T> visitor)
  {
    return visitor.visit(this);
  }
}
