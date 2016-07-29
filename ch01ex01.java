import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter an integer number: ");
    int a = in.nextInt();
    System.out.printf("Number: %d %<o %<X %s\nInverse number: %f %<a\n", 
                       a, Integer.toString(a, 2), 1.0/a);
  }
}
