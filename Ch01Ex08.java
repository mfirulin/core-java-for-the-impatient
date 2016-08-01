import java.util.Scanner;
import java.util.Arrays;

public class Ch01Ex08 {
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String str = in.nextLine();
    str = str.trim();
    String[] substrings = str.split("\\s+");
    System.out.println(Arrays.toString(substrings));
    
    for (int i = 0; i < str.length(); i++)
      for (int j = i; j < str.length(); j++)      
    	System.out.println(str.substring(i, j + 1));
  }
}
