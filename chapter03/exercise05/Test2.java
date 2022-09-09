@FunctionalInterface
interface IntSequence {
	default boolean hasNext() { return true; }
    int next();
  
    public static IntSequence constant(int a) { return () -> a; }
}

public class Test2 {
    public static void main(String[] args) {
        IntSequence constant = IntSequence.constant(2);
    
        for (int i = 0; i < 5; i++)
            System.out.println(constant.next());
    }
}
