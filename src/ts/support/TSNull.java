
package ts.support;

/**
 * Represent Null values
 */
public final class TSNull extends TSPrimitive
{
  /** pre-built value */
  public static final TSNull nullVal = new TSNull();

  // use the "create" method instead
  private TSNull() {}

  /** Create a Null.
   *
   *  @return the new TSNull
   */
  public static TSNull create()
  {
    return nullVal;
  }

  /** Get the value.
   *
   *  @return the Java null from the TSNull
   */
  public Object getInternal()
  {
    return null;
  }

  /** Convert to a Number */
  public TSNumber toNumber()
  {
    return TSNumber.create(0);
  }

  /** Convert to String
   */
  public TSString toStr()
  {
    return TSString.create("null");
  }

  /** Convert to a Boolean */
  public TSBoolean toBoolean() {
    return TSBoolean.create(false);
  }
}
