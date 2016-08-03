import java.util.Scanner;
import java.util.Arrays;

public class Ch01Ex14 {
  public static void main(String[] args) {
    String line;
    int[][] square = null;
    Scanner in = new Scanner(System.in);
    
    do {
      int i = 0;
      boolean squareIsCreated = false;
      line = in.nextLine();
      line = line.trim();
      String[] words = line.split("\\s+");
      
      if (!squareIsCreated) {
        square = new int[words.length][words.length];
        squareIsCreated = true;
      }
      
      if (!line.isEmpty())
        for (int j = 0; j < words.length; j++) 
          square[i][j] = Integer.parseInt(words[j]);

      i++;
    } while (!line.isEmpty());
    
    for (int i = 0; i < square.length; i++) {
      for (int j = 0; j < square[i].length; j++)
        System.out.print(square[i][j] + " ");
      System.out.println();
    }
    System.out.println(Arrays.deepToString(square));
  }
}
