package ts.support;
import java.util.Scanner;

/**
 * Read stdin
 */
public class TSReadLn extends TSFunction
{
  private Scanner in;

  public TSReadLn() {
    in = new Scanner(System.in);
  }

  public TSValue execute(TSValue args[]) {
    if (in.hasNextLine()) {
      return TSValue.make(in.nextLine());
    } else {
      return TSNull.value;
    }
  }
}
