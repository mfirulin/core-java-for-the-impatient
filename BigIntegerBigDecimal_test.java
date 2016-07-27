import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
  public static void main(String[] args) {
    System.out.println(2.0 - 1.1);
    System.out.println(BigDecimal.valueOf(2.0).subtract(BigDecimal.valueOf(1.1)));
    System.out.println(Long.MAX_VALUE + 1);
    System.out.println(new BigInteger("9223372036854775808"));
  }
}
