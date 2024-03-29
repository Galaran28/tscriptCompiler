
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;
import ts.tree.type.UnknownType;

/**
 * AST string literal expression leaf node
 *
 */
public final class BooleanLiteral extends Expression
{
  private boolean value;

  /** Construct a Boolean literal tree node.
   *
   *  @param loc the source code location of the identifier.
   *  @param value the value of the literal.
   */
  public BooleanLiteral(final Location loc, final String value)
  {
    super(loc);
    this.setType(UnknownType.getInstance());
    if (value.equals("false")) {
      this.value = false;
    } else {
      this.value = true;
    }
  }

  /** Get the value of the literal.
   *
   *  @return the value of the literal.
   */
  public boolean getValue()
  {
    return value;
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

