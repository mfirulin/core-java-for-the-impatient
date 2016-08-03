import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Ch01Ex10 {
  public static void main(String[] args) {
    Random generator = new Random();
    int numberOfDigits = generator.nextInt(10);
	  int numberOfLetters = generator.nextInt(10);
    ArrayList<Integer> buffer = new ArrayList<>();
    
    for (int i = 0; i < numberOfDigits; i++)
      buffer.add(generator.nextInt(10) + 48 /* Digits start at 48 */);
    
    for (int i = 0; i < numberOfLetters; i++)
      buffer.add(generator.nextInt(26) + 65);
    
    Collections.shuffle(buffer);
    System.out.println(buffer);
  
    for (int i : buffer)
    	System.out.print((char)i);
  
    System.out.println();
  }
}
