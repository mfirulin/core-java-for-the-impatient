import java.util.Scanner;

public class Ch01Ex11 {
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int[] codePoints = str.codePoints().toArray();
    
    for (int i : codePoints) {
    	System.out.print(i + " ");
    }
  }
}
