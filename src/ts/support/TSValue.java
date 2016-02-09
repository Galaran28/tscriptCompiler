
package ts.support;

import ts.Message;

/**
 * The super class for all Tscript values.
 */
public abstract class TSValue
{
  //
  // conversions (section 9)
  //

  /** Convert to Primitive. Override only in TSObject.
   *  Otherwise just return "this". Note: type hint is not implemented.
   *
   *  @return the "this" value
   */
  public TSPrimitive toPrimitive()
  {
    return (TSPrimitive) this;
  }

  abstract public TSNumber toNumber();

  abstract public TSBoolean toBoolean();

  /** Convert to String. Override for all primitive types.
   *  It can't be called toString because of Object.toString.
   *
   *  @return produced TSString value
   */
  public TSString toStr()
  {
    TSPrimitive prim = this.toPrimitive();
    return prim.toStr();
  }


  //
  // binary operators (sections 11.5-11.11)
  //

  /** Perform a multiply. "this" is the left operand and the right
   *  operand is given by the parameter. Both operands are converted
   *  to Number before the multiply.
   *
   * @param right value to be multiplied
   * @return the result of the multiplication
   */
  public final TSNumber multiply(final TSValue right)
  {
    TSNumber leftValue = this.toNumber();
    TSNumber rightValue = right.toNumber();
    return TSNumber.create(leftValue.getInternal() * rightValue.getInternal());
  }

  /** Perform an addition. "this" is the left operand and the right
   *  operand is given by the parameter. Both operands are converted
   *  to Number before the addition.
   *
   * @param right value to be added
   * @return the result of the addition
   */
  public final TSPrimitive add(final TSValue right)
  {
    TSPrimitive leftValue = this.toPrimitive();
    TSPrimitive rightValue = right.toPrimitive();

    // if one of the operands is a string, then the operation is string
    // concatentation and the other operand must first be converted to
    // a string
    if (leftValue instanceof TSString)
    {
      return TSString.create(((TSString) leftValue).getInternal() +
        rightValue.toStr().getInternal());
    }
    else if (rightValue instanceof TSString)
    {
      return TSString.create(leftValue.toStr().getInternal() +
        ((TSString) rightValue).getInternal());
    }

    // othewise the operation is numeric addition
    return TSNumber.create(leftValue.toNumber().getInternal() +
      rightValue.toNumber().getInternal());
  }

  //
  // test for undefined
  //

  /** Is this value Undefined? Override only in TSUndefined.
   *
   * @return true or false, is this value the undefined value?
   */
  public boolean isUndefined()
  {
    return false;
  }

  //
  // conversions to support optimized code generation
  //

  /** Convert a Java String to a TSString. Supports optimized code generation.
   *
   *  @param value Java String to be converted
   *  @return result of conversion
   */
  public static TSValue make(String value)
  {
    return TSString.create(value);
  }

  /** Convert a Java double to a TSNumber. Supports optimized code generation.
   *
   *  @param value Java double to be converted
   *  @return result of conversion
   */
  public static TSValue make(double value)
  {
    return TSNumber.create(value);
  }

  /** Do nothing, since value already a TSValue. Supports optimized code
   *  generation.
   *
   *  @param value a TSValue already
   *  @return the argument unchanged
   */
  public static TSValue make(TSValue value)
  {
    return value;
  }

}

