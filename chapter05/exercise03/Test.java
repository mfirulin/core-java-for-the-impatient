import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.InputMismatchException;

public class Test {
    public static List<Double> readValues(String fileName) throws IOException {
        List<Double> numbers = new ArrayList<>();
        
        try (Scanner in = new Scanner(Paths.get(fileName))) {
            while (in.hasNextDouble()) {
                numbers.add(in.nextDouble());
			}
        }
        return numbers;
    }

    public static double sumOfValues(String fileName) throws IOException {
        List<Double> numbers;
		
        try {
            numbers = readValues(fileName);
        } catch (IOException e) {
            throw e;
        }

        double sum = 0;
	
        for (double n : numbers) {
            sum += n;
		}
		
        return sum;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(sumOfValues("Test.txt"));
        } catch (IOException e) {
            System.err.println("Cannot open the file: " + e);
        } catch (InputMismatchException e) {
            System.err.println("Wrong input: " + e);
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e);
        }
    }
}
