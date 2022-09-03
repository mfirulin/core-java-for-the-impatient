/*
* There should also be data.csv file with lines like this: 
* first,second,third
* Commands for compiling and running (Java 17):
* javac -d . -classpath ./opencsv-3.10.jar Test.java
* java -classpath ./opencsv-3.10.jar:. Test
*/

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        String[] lines;
        
        while ((lines = reader.readNext()) != null) {
            System.out.println(lines[0]);
			System.out.println(lines[1]);
			System.out.println(lines[2]);
		}
    }
}
