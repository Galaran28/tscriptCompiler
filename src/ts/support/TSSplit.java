package ts.support;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Read stdin
 */
public class TSSplit extends TSFunction
{
  public TSValue execute(TSValue args[]) {
    String str = args[0].toStr().getInternal();
    String seperator = args[1].toStr().getInternal();;
    String[] result;
    TSObject ret = TSObject.create();

    if (args.length > 2) {
      int limit = (int)args[2].toNumber().getInternal();;
      result = str.split(seperator, limit);
    } else {
      result = str.split(seperator);
    }

    for (int index = 0; index < result.length; index++) {
      ret.set(String.valueOf(index), TSValue.make(result[index]));
    }

    ret.set("length", TSValue.make(result.length));
    return ret;
  }
}
