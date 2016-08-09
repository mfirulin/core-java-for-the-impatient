import java.util.Random;
import java.util.ArrayList;

public class RandomNumbers {
  private static final Random generator = new Random();
  
  public static int randomElement(int[] a) {
    int index = generator.nextInt(a.length);
    return a[index];
  }
  
  public static int randomElement(ArrayList<Integer> a) {
    int index = generator.nextInt(a.size());
	  return a.get(index);
  }
}

public class Test {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};
    ArrayList<Integer> arrayList = new ArrayList<>(); 

    for (int i = 1; i <= 6; i++) {
    	arrayList.add(i);
    }

    for (int i = 0; i < 20; i++) {
      int a = RandomNumbers.randomElement(array);
      System.out.print(a + " ");
    }
    System.out.println();
    
    for (int i = 0; i < 20; i++) {
      int a = RandomNumbers.randomElement(arrayList);
      System.out.print(a + " ");
    }
    System.out.println();
  }
}
