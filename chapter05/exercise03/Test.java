import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.InputMismatchException;

public class Test {
    public static ArrayList<Double> readValues(String filename)
        throws IOException, InputMismatchException
    {
        ArrayList<Double> numbers = new ArrayList<>();
        
        try (Scanner in = new Scanner(Paths.get(filename))) {
            while(in.hasNext())
                numbers.add(in.nextDouble());
        }
        return numbers;
    }

    public static double sumOfValues(String filename)
        throws IOException, InputMismatchException
    {
        ArrayList<Double> numbers;
        double sum = 0;
		
        try {
            numbers = readValues(filename);
        }
            catch (IOException e) {
            throw e;
        }

        for (double n : numbers) 
            sum += n;
		
        return sum;
    }
    
    public static void main(String[] args) {
        try {
            double sum = sumOfValues("Test.txt");
            System.out.println(sum);
        }
        catch (IOException e) {
            System.err.println("Can't open the file: " + e);
        }
        catch (InputMismatchException e) {
            System.err.println("Wrong input: " + e);
        }
        catch (Exception e) {
            System.err.println("Something went wrong: " + e);
        }
    }
}
