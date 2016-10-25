import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Ch01Ex13 {
    public static void main(String[] args){
        Random generator = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= 49; i++)
            numbers.add(i);
        
        for (int i = 0; i < 6; i++)
            result.add(numbers.remove(generator.nextInt(49 - i)));
        
        Collections.sort(result);
        System.out.println(result);
        System.out.println(numbers);
    }
}
