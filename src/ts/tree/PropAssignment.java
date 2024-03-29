package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

import java.util.List;

/**
 * node for a property assignment.
 *
 */
public final class PropAssignment extends Expression
{
  private Expression name, value;

  // record the object that this property should be placed in
  public String objectRef;

  /** Construct an object literal.
   *
   *  @param loc the source code location of the expression.
   *  @param name name of the property.
   *  @param value value of the property
   */
  public PropAssignment(final Location loc,
      final Expression name, final Expression value)
  {
    super(loc);
    this.name = name;
    this.value = value;
  }

  /** Get the property name.
   *
   *  @return the property name.
   */
  public Expression getName()
  {
    return name;
  }

  /** Get the property value.
   *
   *  @return the property value.
   */
  public Expression getValue()
  {
    return value;
  }

  /** Set the property name.
   *  @param name name of the property.
   */
  public void setName(Expression name)
  {
    this.name = name;
  }

  /** Set the property value.
   *  @param value value of the property.
   */
  public void setValue(Expression value)
  {
    this.value = value;
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

