package ts.support;
import java.util.HashMap;

/**
 * class for TSGlobal object
 */
public final class TSGlobal extends TSObject
{
  private TSGlobal() {
    super();
    this.set("undefined", TSValue.make(TSUndefined.value));
    this.set("NaN", TSValue.make(Double.NaN));
    this.set("Infinity", TSValue.make(Double.POSITIVE_INFINITY));
    this.set("readln", new TSReadLn());
    this.set("isNaN", new TSIsNan());
    this.set("isFinite", new TSIsFinite());
  }

  public static TSGlobal create() {
    return new TSGlobal();
  }
}
