import java.io.File;

public class Ch03Ex11 {
  
  private static void printAllFilesWithExtension(String pathName, String extension) {
  	File directory = new File(pathName);
    String[] files = directory.list((dir, name) -> name.endsWith("." + extension));
    if (files == null) return;
    
    for (String file : files) 
      System.out.println(file);
  }

  public static void main(String[] args) {
    if (args.length == 2)
      printAllFilesWithExtension(args[0], args[1]);
    else
  	  printAllFilesWithExtension(".", "java");
  }
}
