/*
* There should also be data.csv file with lines like this: 
* first,second,third
* Commands for compiling and running:
* javac -d . -classpath ./opencsv-3.8.jar Test.java
* java -classpath .:./opencsv-3.8.jar Test
*/

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        String[] line;
        
        while ((line = reader.readNext()) != null)
            System.out.println(line[0] + " " + line[1] + " " + line[2]);
    }
}
