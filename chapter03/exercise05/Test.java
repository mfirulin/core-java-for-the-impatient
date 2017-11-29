interface IntSequence {
    boolean hasNext();
    int next();
  
    public static IntSequence constant(int a) {
        return new IntSequence() {
            public boolean hasNext() { return true; }
            public int next() { return a; }
        };
    }
}

public class Test {
    public static void main(String[] args) {
        IntSequence constant = IntSequence.constant(1);
    
        for(int i = 0; i < 5 && constant.hasNext(); i++)
            System.out.println(constant.next());
    }
}
