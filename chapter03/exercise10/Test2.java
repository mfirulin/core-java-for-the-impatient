import java.io.File;
import java.io.FileFilter;

public class Test2 {
  
    private static FileFilter isDirectory() {
        return new FileFilter() {
            public boolean accept(File name) {
                return name.isDirectory();
            }
        };
    }
  
    private static void printSubDirs(String name) {
        File[] dirs = new File(name).listFiles(isDirectory());
    
        if (dirs == null) return;
    
        for (File dir : dirs) {
            String dirName = dir.getName();
            String pathName = dir.getPath();
            System.out.println(dirName);
            printSubDirs(pathName);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0)
            printSubDirs(args[0]);
        else
            printSubDirs(".");
    }
}
