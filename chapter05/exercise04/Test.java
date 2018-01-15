import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.InputMismatchException;

public class Test {
    private ArrayList<Double> numbers;
    private double sum;
    
    public int readValues(String filename)
    {
        if (numbers != null)
            numbers.clear();
        else
            numbers = new ArrayList<>();
        
        try (Scanner in = new Scanner(Paths.get(filename))) {
            while(in.hasNext())
                numbers.add(in.nextDouble());
        }
        catch (InputMismatchException | IOException e) {
            System.err.println("Something went wrong: " + e);
            numbers.clear();
            numbers = null;
            return 1;
        }
        
        return 0;
    }

    public int sumOfValues(String filename)
    {
        int res = readValues(filename);
        
        if(res != 0)
            return res;
        
        sum = 0;
		
        for (double n : numbers) 
            sum += n;
		
        return 0;
    }
    
    public double getSum() {
        return sum;
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        int res = t.sumOfValues("Test.txt");
        
        if(res == 0) 
            System.out.println("Sum: " + t.getSum());
    }
}
