package ts.support;

/**
 * Read stdin
 */
public class TSKeys extends TSFunction
{
  public TSValue execute(TSValue args[]) {
    TSObject input = (TSObject) args[0];
    TSObject ret = TSObject.create();
    int index = 0;
    for (String key : input.propertyTable.keySet()) {
      if (key.equals("prototype")) {
        continue;
      }
      ret.set(String.valueOf(index), TSValue.make(key));
      index++;
    }
    ret.set("length", TSValue.make(index));
    return ret;
  }
}
