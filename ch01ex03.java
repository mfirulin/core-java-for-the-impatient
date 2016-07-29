import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    int result;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int a = in.nextInt();
    System.out.print("Enter the second number: ");
    int b = in.nextInt();
    System.out.print("Enter the third number: ");
    int c = in.nextInt();
    
    // Realization with 'if'
    if (b < a && a > c)
      result = a;
    else if (a < b && b > c)
      result = b;
    else
      result = c;
    System.out.println(result);
    
    // Realizaion with Math.max()
    result = Math.max(a, b);
    result = Math.max(result, c);
    System.out.println(result);
  }
}
