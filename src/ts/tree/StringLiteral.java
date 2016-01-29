
package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;
import ts.tree.type.StringType;

/**
 * AST string literal expression leaf node
 *
 */
public final class StringLiteral extends Expression
{
  private String value;

  /** Construct a string literal tree node.
   *
   *  @param loc the source code location of the identifier.
   *  @param value the value of the literal.
   */
  public StringLiteral(final Location loc, final String value)
  {
    super(loc);
    this.setType(StringType.getInstance());
    this.value = value;
  }

  /** Get the value of the literal.
   *
   *  @return the value of the literal.
   */
  public String getValue()
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

