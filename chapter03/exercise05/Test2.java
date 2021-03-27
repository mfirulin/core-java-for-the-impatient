@FunctionalInterface
interface IntSequence {
    int next();
  
    public static IntSequence constant(int a) { return () -> a; }
}

public class Test2 {
    public static void main(String[] args) {
        IntSequence constant = IntSequence.constant(3);
    
        for(int i = 0; i < 10; i++)
            System.out.println(constant.next());
    }
}
