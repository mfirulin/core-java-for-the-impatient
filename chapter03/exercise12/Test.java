import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static File[] getFiles(String pathName) {
        return new File(pathName).listFiles();
    }
    
    public static void printFiles(File[] files) {
        for (File file : files)
            System.out.println(file.getName());
    }
    
    public static void main(String[] args) {
        File[] files;
        
        if (args.length > 0)
            files = getFiles(args[0]);
        else
            files = getFiles(".");
            
        if (files == null) return;
 
        Arrays.sort(files, Comparator.comparing(File::isFile).
                           thenComparing(File::getName));
        /* Or with lambda:
         *      Arrays.sort(files, Comparator.comparing((File f) -> f.isFile()).
         *                  thenComparing((File f) -> f.getName()));
        */
        
        printFiles(files);    
    }
}
