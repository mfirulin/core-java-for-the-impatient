import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
  
    while (true) {
      System.out.print("Press q/Q to exit: ");
      if (in.hasNext()) {
        String input = in.next();
      	if ("q".equalsIgnoreCase(input))
        	break;
      }
    }
  }
}
