import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

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
    
    public static void main(String[] args) {
        try {
            System.out.println(readValues("Test.txt"));
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
