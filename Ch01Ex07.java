import java.util.Scanner;

public class Ch01Ex07 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first number (from 0 to 65535): ");       
    short a = (short)in.nextInt();
    System.out.print("Enter the second number (from 0 to 65535): ");
    short b = (short)in.nextInt();
        
    System.out.println("a + b = " + Short.toUnsignedInt((short)(a + b)));
    System.out.println("a - b = " + Short.toUnsignedInt((short)(a - b)));
    System.out.println("a * b = " + Short.toUnsignedInt(a) * Short.toUnsignedInt(b));
    System.out.println("a / b = " + Short.toUnsignedInt(a) / Short.toUnsignedInt(b));
    System.out.println("a % b = " + Short.toUnsignedInt(a) % Short.toUnsignedInt(b));
  }
}
