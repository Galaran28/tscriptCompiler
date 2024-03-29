package ts.tree;

import ts.Location;
import ts.tree.visit.TreeVisitor;

import java.util.List;

/**
 * node for the root of a ObjectLiteral.
 *
 */
public final class ObjectLiteral extends Expression
{
  private List<Expression> propertyList;

  /** Construct an object literal.
   *
   *  @param loc the source code location of the expression.
   *  @param list list of propertyies that make up object
   */
  public ObjectLiteral(final Location loc, final List<Expression> list)
  {
    super(loc);
    this.propertyList = list;
  }

  /** Get the list of statements.
   *
   *  @return the statement list.
   */
  public List<Expression> getList()
  {
    return propertyList;
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

