import java.math.BigInteger;

interface Sequence<T> {
    boolean hasNext();
    T next();
}

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger a = BigInteger.valueOf(0);
    private BigInteger b = BigInteger.valueOf(1);
    
    public boolean hasNext() {
        return true;
    }

    public BigInteger next() {
        a = a.add(b);
        return a.multiply(a);
    }

    public static void main(String[] args) {
        Sequence<BigInteger> seq = new SquareSequence();

        for (int i = 0; i < 100; i++) {
            if (seq.hasNext()) {
                System.out.print(seq.next() + " ");
            }
        }
    }
}
