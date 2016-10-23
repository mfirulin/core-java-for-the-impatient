import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter a line: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] codePoints = str.codePoints().toArray();
    
        for (int i : codePoints) {
            System.out.print(i + ": ");
            System.out.println((char)i);
        }
    }
}
