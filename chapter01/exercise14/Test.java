import java.util.Scanner;
import java.util.Arrays;

public class Test {

    private static final int SIZE = 5;
  
    public static void main(String[] args) {
        int rows, columns = 0, controlSum = 0, sum;
        int[][] square = new int[SIZE][SIZE];
        Scanner in = new Scanner(System.in);
        
        for (rows = 0; rows < SIZE; rows++) {
            String line = in.nextLine().trim();
            if (line.isEmpty()) break;
            String[] words = line.split("\\s+");
                
            for (columns = 0; columns < words.length && columns < SIZE; columns++) 
                square[rows][columns] = Integer.parseInt(words[columns]);
        }
        
        //System.out.println(Arrays.deepToString(square));

        // Find control sum
        for (int j = 0; j < columns; j++)
            controlSum += square[0][j];
        
        // Check rows
        for (int i = 1; i < rows; i++) {
            sum = 0;
            for (int j = 0; j < columns; j++)
                sum += square[i][j];

            if (sum != controlSum) {
                System.out.println("Not magic");
                return;
            }
        }
        
        // Check columns
        for (int j = 0; j < columns; j++) {
            sum = 0;
            for (int i = 0; i < rows; i++)
                sum += square[i][j];
     
            if (sum != controlSum) {
                System.out.println("Not magic");
                return;
            }
        }
        
        // Check dioganals
        sum = 0;
        for (int i = 0, j = 0; i < rows; i++, j++)
            sum += square[i][j];
        
        if (sum != controlSum) {
            System.out.println("Not magic");
            return;
        }
        
        sum = 0;
        for (int i = rows - 1, j = 0; i >= 0; i--, j++)
            sum += square[i][j];
         
        if (sum != controlSum) {
            System.out.println("Not magic");
            return;
        }
        
        System.out.println("Magic");
    }
}
