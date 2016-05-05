
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

  public TSValue execute(TSValue[] args) {
    return null;
  }

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

  /** Perform a less than. "this" is the left operand and the right
   *  operand is given by the parameter.
   *
   * @param right value to be compared
   * @return the result of the comparison
   */
  public final TSBoolean lessthan(final TSValue right)
  {
    TSValue result = comparison(this, right, true);
    if (result instanceof TSUndefined) {
      return TSBoolean.create(false);
    } else {
      return (TSBoolean) result;
    }
  }

  /** Perform a greater than. "this" is the left operand and the right
   *  operand is given by the parameter.
   *
   * @param right value to be compared
   * @return the result of the comparison
   */
  public final TSBoolean greaterthan(final TSValue right)
  {
    TSValue result = comparison(right, this, false);
    if (result instanceof TSUndefined) {
      return TSBoolean.create(false);
    } else {
      return (TSBoolean) result;
    }
  }

  /** Perform a logical not. "this" is the left operand there is not right op
   *
   * @return the result of the negation
   */
  public final TSBoolean lnot()
  {
    if (this.toBoolean().getInternal()) {
      return TSBoolean.create(false);
    }
    return TSBoolean.create(true);
  }

  /** Test equality. "this" is the left operand and the right
   * operand is given by the parameter
   *
   * @param right value to be compared
   * @return the result of the negation
   */
  public final TSBoolean equality(final TSValue right)
  {
    return TSBoolean.create(equals(right, this));
  }

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

  private static TSValue comparison(TSValue x, TSValue y, boolean leftFirst) {
    TSPrimitive xvalue, yvalue;
    if (leftFirst) {
      xvalue = x.toPrimitive();
      yvalue = y.toPrimitive();
    } else {
      yvalue = y.toPrimitive();
      xvalue = x.toPrimitive();
    }

    if (xvalue instanceof TSString && yvalue instanceof TSString) {
      // perfrom string comparison
      String xstring = xvalue.toString();
      String ystring = yvalue.toString();
      if (xstring.compareTo(ystring) < 0) {
        return TSBoolean.create(true);
      } else {
        return TSBoolean.create(false);
      }
    } else {
      // perform number comparison
      double xnum = xvalue.toNumber().getInternal();
      double ynum = yvalue.toNumber().getInternal();

      if (Double.isNaN(xnum) || Double.isNaN(ynum)) {
         return TSUndefined.value;
      }

      if (xnum < ynum) {
        return TSBoolean.create(true);
      } else {
        return TSBoolean.create(false);
      }
    }
  }

  private static boolean equals(TSValue x, TSValue y) {
    if (x.getClass().equals(y.getClass())) {
      if (x instanceof TSUndefined) { return true; }
      if (x instanceof TSNull) { return true; }

      if (x instanceof TSNumber) {
        double xnum = x.toNumber().getInternal();
        double ynum = y.toNumber().getInternal();

        if (Double.isNaN(xnum) || Double.isNaN(ynum)) {
          return false;
        }

        if (xnum == ynum) {
          return true;
        }

        return false;
      }

      if (x instanceof TSString) {
        String xstring = x.toString();
        String ystring = y.toString();
        if (xstring.compareTo(ystring) == 0) {
          return true;
        } else {
          return false;
        }
      }

      // TSBoolean is a singleton so we can use Object.equals
      // if they are the same object the result will be the same
      // as if when they are TSBoolean
      if (x.equals(y)) { return true; }
      else { return false; }
    }

    if (x instanceof TSNull && y instanceof TSUndefined) {return true; }
    if (y instanceof TSNull && x instanceof TSUndefined) {return true; }

    if (x instanceof TSNumber && y instanceof TSString) {
      return equals(x, y.toNumber());
    }
    if (x instanceof TSString && y instanceof TSNumber) {
      return equals(x.toNumber(), y);
    }

    if (x instanceof TSBoolean) {
      return equals(x.toNumber(), y);
    }
    if (y instanceof TSBoolean) {
      return equals(x, y.toNumber());
    }

    // TODO: handle objects

    return false;
  }
}

