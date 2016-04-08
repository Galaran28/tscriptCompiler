package ts.support;
import java.util.HashMap;

/**
 * The super class for all Tscript primitive values.
 */
public class TSObject extends TSValue
{
  private HashMap<String, TSValue> propertyTable;

  private TSObject() {
    this.propertyTable = new HashMap<String, TSValue>();
    this.propertyTable.put("prototype", null);
  }

  public TSObject create() {
    return new TSObject();
  }

  public void set(String property, TSValue value) {
    this.propertyTable.put(property, value);
  }

  public TSValue  get(String property) {
    return this.propertyTable.get(property);
  }

  public TSNumber toNumber() {
    return null;
  }

  public TSBoolean toBoolean() {
    return TSBoolean.create(true);
  }
}
