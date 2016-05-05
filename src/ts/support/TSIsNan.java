package ts.support;
import java.util.Scanner;

/**
 * Read stdin
 */
public class TSIsNan extends TSFunction
{
  public TSValue execute(TSValue args[]) {
    TSNumber input = args[0].toNumber();
    if (Double.isNaN(input.getInternal())) {
      return TSBoolean.create(true);
    } else {
      return TSBoolean.create(false);
    }
  }
}
