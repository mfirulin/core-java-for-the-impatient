import java.io.File;
import java.util.Arrays;

public class Ch03Ex10 {
  
  private static void printSubDirs(String name) {
    File[] dirs = new File(name).listFiles((f) -> f.isDirectory());
    /* or:
    File[] dirs = new File(name).listFiles(File::isDirectory);
    */
    
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