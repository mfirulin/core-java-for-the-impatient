public class Ch01Ex09 {
  public static void main(String[] args) {
	String str1 = "Hello, World!";
    String str2 = str1.substring(7, 12);
    String str3 = "World";
    String str4 = new String(str2);
    
    System.out.println(String.join(", ", str2, str3, str4));
    System.out.println("World".equals(str2) && "World".equals(str3) && "World".equals(str4)); // True
    System.out.println(str2 == str3 || str2 == str4 || str3 == str4); // False
  }
}
