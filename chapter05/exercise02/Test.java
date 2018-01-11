import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class Test {
    public static ArrayList<Double> readValues(String filename)
        throws IOException
    {
        ArrayList<Double> numbers = new ArrayList<>();
        
        try (Scanner in = new Scanner(Paths.get(filename))) {
            while(in.hasNextDouble())
                numbers.add(in.nextDouble());
        }
        return numbers;
    }

    public static double sumOfValues(String filename)
        throws IOException
    {
        ArrayList<Double> numbers;
		
        try {
            numbers = readValues(filename);
        }
            catch (IOException ex) {
            throw ex;
        }

        double sum = 0;
	
        for (double n : numbers) 
            sum += n;
		
        return sum;
    }
    
    public static void main(String[] args) {
        try {
            double sum = sumOfValues("Test.txt");
            System.out.println(sum);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
