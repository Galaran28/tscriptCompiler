
package ts.support;

/**
 * Represent Number values
 * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-8.5">ELS
 * 5.1</a>).
 */
public final class TSBoolean extends TSPrimitive
{
  /** pre-built value for false */
  public static final TSBoolean falseVal = new TSBoolean(false);
  /** pre-built value for true */
  public static final TSBoolean trueVal = new TSBoolean(true);

  // use the "create" method instead
  private TSBoolean(final boolean value)
  {
    this.value = value;
  }

  private final boolean value;

  /** Create a Boolean with the given value.
   *
   *  @param value the Java boolean to be encapsulated by the TSBoolean
   *  @return the new TSBoolean
   */
  public static TSBoolean create(final boolean value)
  {
    if (value) {
      return trueVal;
    } else {
      return falseVal;
    }
  }

  /** Get the value.
   *
   *  @return the Java boolean from the TSBoolean
   */
  public boolean getInternal()
  {
    return value;
  }

  /** Convert to a Number */
  public TSNumber toNumber()
  {
    if (value) {
      return TSNumber.create(1);
    } else {
      return TSNumber.create(0);
    }
  }

  /** Convert Number to String
   * (<a href="http://www.ecma-international.org/ecma-262/5.1/#sec-9.8.1">ELS
   * 9.8.1</a>)
   */
  public TSString toStr()
  {
    if (value) {
      return TSString.create("true");
    } else {
      return TSString.create("false");
    }
  }

  /** Convert to a Boolean, do nothing since we are a boolean */
  public TSBoolean toBoolean() {
    return this;
  }
}



