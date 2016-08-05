import java.util.Scanner;
import java.util.ArrayList;

public class Ch01Ex15 {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    System.out.print("Enter a number of lines: ");
    int n = in.nextInt();
    ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      ArrayList<Integer> row = new ArrayList<Integer>();
      row.add(1);
      for (int j = 1; j < i; j++) {
      	row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
      }
      if(i != 0) {
      	row.add(1);
      }
      triangle.add(row);
    }
    
    for (ArrayList<Integer> row : triangle) {
      for (int element : row) {
      	System.out.printf("%4d", element);
      }
      System.out.println();
    }
  }
}
