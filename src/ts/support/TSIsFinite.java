package ts.support;
import java.util.Scanner;

/**
 * Read stdin
 */
public class TSIsFinite extends TSFunction
{
  public TSValue execute(TSValue args[]) {
    Double num = args[0].toNumber().getInternal();
    if (Double.isNaN(num) | Double.isInfinite(num)) {
      return TSBoolean.create(false);
    } else {
      return TSBoolean.create(true);
    }
  }
}
