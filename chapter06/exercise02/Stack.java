import java.util.Arrays;

public class Stack<E> {
    private static final int CAPACITY = 5;
    private Object[] list = new Object[CAPACITY];
    private int numberOfElements;
    
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }
    
    public void push(E e) {
        if (list.length == numberOfElements) {
            list = Arrays.copyOf(list, 2 * numberOfElements + 1);
        }
        list[numberOfElements++] = e;
    }
    
    @SuppressWarnings("unchecked")
    public E pop() {
        E e = null;
        if (numberOfElements > 0) {
            e = (E)list[--numberOfElements]; 
        }
        list[numberOfElements] = null;
        return e;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < numberOfElements; i++) {
            builder.append(list[i].toString());
            builder.append(", ");
        }
        
        // Remove last ", " if it was added
        if (numberOfElements > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }
        builder.append("]");
        return builder.toString();
    }
       
    public static void main(String[] args) {
        // Integer
        Stack<Integer> stackInt = new Stack<>();
        for (int i = 1; i < 10; i++) {
            stackInt.push(i);
        }
        System.out.println(stackInt.toString());

        for (int i = 1; i < 5; i++) {
            stackInt.pop();
        }
        System.out.println(stackInt.toString());
        
        // String
        Stack<String> stackStr = new Stack<>();
        for (int i = 1; i < 10; i++) {
            stackStr.push("Str" + i);
        }
        System.out.println(stackStr.toString());

        for (int i = 1; i < 5; i++) {
            stackStr.pop();
        }
        System.out.println(stackStr.toString());

        do {
        } while (stackStr.pop() != null);
        System.out.println(stackStr.toString());
    }
}