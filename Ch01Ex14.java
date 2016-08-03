import java.util.Scanner;
import java.util.Arrays;

public class Ch01Ex14 {

  private static final int SIZE = 5;
  
  public static void main(String[] args) {
    int rows = 0, columns = 0, sum = 0;
    int[][] square = new int[SIZE][SIZE];
    Scanner in = new Scanner(System.in);
    
    for (; rows < SIZE; rows++) {
      String line = in.nextLine().trim();
      String[] words = line.split("\\s+");
      
      if (line.isEmpty())
        break;
        
      for (columns = 0; columns < words.length && columns < SIZE; columns++) 
        square[rows][columns] = Integer.parseInt(words[columns]);
    }
    
   //System.out.println(Arrays.deepToString(square));

    // Find control sum
    for (int a : square[0])
      sum += a;
    
    // Check rows
    for (int i = 1; i < rows; i++) {
      int s = 0;
      for (int j = 0; j < columns; j++)
        s += square[i][j];

      if (s != sum) {
        System.out.println("Not magic");
        return;
      }
    }
    
    // Check columns
    for (int j = 0; j < columns; j++) {
      int s = 0;
      for (int i = 0; i < rows; i++)
        s += square[i][j];
 
      if (s != sum) {
        System.out.println("Not magic");
        return;
      }
    }
    
    // Check dioganals
    int s = 0;
    for (int i = 0, j = 0; i < rows; i++, j++)
        s += square[i][j];
    
    if (s != sum) {
        System.out.println("Not magic");
        return;
    }
    
    s = 0;
    for (int i = rows - 1, j = 0; i >= 0; i--, j++)
        s += square[i][j];
     
    if (s != sum) {
        System.out.println("Not magic");
        return;
    }
  }
}
