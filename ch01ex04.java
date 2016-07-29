import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    System.out.println(Double.MIN_VALUE);
    System.out.println(Math.nextUp(0.0));
    System.out.println(Double.MAX_VALUE);
    System.out.println(Math.nextDown(Double.POSITIVE_INFINITY));
    System.out.println(Math.nextUp(Double.NEGATIVE_INFINITY));
  }
}
