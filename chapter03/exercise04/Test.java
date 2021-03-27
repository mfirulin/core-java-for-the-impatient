interface IntSequence {
    boolean hasNext();
    int next();
  
    public static IntSequence of(int... values) {
        return new IntSequence() {
            private int index = 0;
      
            public boolean hasNext() {
                return index < values.length;
            }
      
            public int next() {
                if (index < values.length)
                    return values[index++];
                else // If the end is reached, return the last element endlessly
                    return values[values.length - 1]; 
            }
        };
    }
}

public class Test {
    public static void main(String[] args) {
        IntSequence digits = IntSequence.of(-1, 0, 1, 2, 3, 4, 5);
        
        while (digits.hasNext())
            System.out.println(digits.next());
    }
}
