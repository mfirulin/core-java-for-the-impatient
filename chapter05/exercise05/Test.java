import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Test {
    public static void readWriteValues(String input, String output) {
        Scanner in = null;
        PrintWriter out = null;
        
        try {
            in = new Scanner(Paths.get(input));
        }
        catch (IOException ex) {
            System.err.println(ex);
            return;
        }
        
        try {
            out = new PrintWriter(output);
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex);
            return;
        }
        
        try {
            while(in.hasNext()) {
                out.println(in.next());
            }   
        }
        catch (IllegalStateException ex1) {}
        
        if (in != null) in.close();
        if (out != null) out.close();
    }

    public static void main(String[] args) {
        readWriteValues("input.txt", "output.txt");
    }
}
