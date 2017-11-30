import java.util.Random;

interface IntSequence {
    default boolean hasNext() { return true; }
    int next();
}

public class Test {
    private static Random generator = new Random();
    
    public static class RandomSequence implements IntSequence {
        int low, high;
        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }
        public int next() { return low + generator.nextInt(high - low + 1); }
    }
    
    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
    
    public static void main(String[] args) {
        IntSequence is = randomInts(1, 6);
        for (int i = 0; i < 10; i++)
            System.out.println(is.next());
    }
}
