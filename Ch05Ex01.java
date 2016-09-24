import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class Ch05Ex01 {
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
    
    public static void main(String[] args) {
        ArrayList<Double> numbers;
        
        try {
            numbers = readValues("Ch05Ex01.txt");
            for (double d : numbers)
                System.out.println(d);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
