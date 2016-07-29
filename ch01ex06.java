import java.math.BigInteger;

public class Test {
  public static void main(String[] args) {
    BigInteger n = BigInteger.valueOf(1);
    
    for (int i = 2; i <= 1000; i++)
      n = n.multiply(BigInteger.valueOf(i));
    System.out.println(n);
  }
}
