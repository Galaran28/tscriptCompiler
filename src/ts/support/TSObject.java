package ts.support;
import java.util.HashMap;

/**
 * Class for all TSObject at runtime
 */
public class TSObject extends TSValue
{
  private HashMap<String, TSValue> propertyTable;

  private TSObject() {
    this.propertyTable = new HashMap<String, TSValue>();
    this.propertyTable.put("prototype", null);
  }

  public static TSObject create() {
    return new TSObject();
  }

  public static TSObject create(TSValue ths) {
    TSObject ret = new TSObject();
    if (ths instanceof TSObject) {
      ret.set("prototype", ((TSObject)ths).get("prototype"));
    }
    return ret;
  }

  public void set(String property, TSValue value) {
    this.propertyTable.put(property, value);
  }

  public TSValue get(String prop) {
    HashMap<String, TSValue> current = this.propertyTable;
    if (current.containsKey(prop)) { return current.get(prop); }

    TSObject proto = (TSObject) current.get("prototype");
    if (proto == null) { return TSUndefined.value; }
    return proto.get(prop);
  }

  public TSNumber toNumber() {
    return null;
  }

  public TSBoolean toBoolean() {
    return TSBoolean.create(true);
  }
}
