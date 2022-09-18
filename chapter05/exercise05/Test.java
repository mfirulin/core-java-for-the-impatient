import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Test {
	
	private static Scanner in;
    private static PrintWriter out;
	
    public static void readWriteValues(String inputFileName, String outputFileName) {
        
        try {
            in = new Scanner(Paths.get(inputFileName));
        } catch (IOException e) {
            System.err.println(e);
            return;
        }
        
        try {
            out = new PrintWriter(outputFileName);
        } catch (FileNotFoundException e) {
            System.err.println(e);
			closeIn();
            return;
        }
        
        try {
            while (in.hasNext()) {
                out.println(in.next());
            }   
        } finally {
			closeIn();
			closeOut();
		}
    }
	
	private static void closeIn() {
		if (in != null) {
			in.close();
		}
	}
	
	private static void closeOut() {
		if (out != null) {
			out.close();
		}
	}

    public static void main(String[] args) {
        readWriteValues("input.txt", "output.txt");
    }
}
