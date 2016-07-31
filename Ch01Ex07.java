import java.util.Scanner;

public class Ch01Ex07 {
  public static void main(String args[]) {
    /*
  	Scanner in = new Scanner(Sistem.in);
    System.out.print("Enter the first number (from 0 to 65535): ");
    short a = in.nextShort();
    System.out.print("Enter the second number (from 0 to 65535): ");
    short b = in.nextShort();
    */
    
    short a = 65530;
    short b = 2;
    
    short sum = (short)(a + b);
    short difference = (short)(a - b);
    short product = (short)(a * b);
    short quotient = (short)(a / b);
    short remainder = (short)(a % b);
    
    System.out.println("a + b = " + sum);
    System.out.println("a - b = " + difference);
    System.out.println("a * b = " + product);
    System.out.println("a / b = " + quotient);
    System.out.println("a % b = " + remainder);
  }
}
