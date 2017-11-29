import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;

class StringComparator implements Comparator<String> {
    public int compare(String first, String second) {
  	    return -1 * first.compareTo(second);
    }
}

public class Test {
    private static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        Collections.sort(strings, comp);
    }
  
    public static void main(String[] args) {
	    ArrayList<String> strings = new ArrayList<>(Arrays.asList("Peter", "Scott", "Anna"));  
        luckySort(strings, new StringComparator());
        System.out.println(strings);
    }
}
