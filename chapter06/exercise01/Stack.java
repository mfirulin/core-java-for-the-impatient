import java.util.List;
import java.util.ArrayList;

public class Stack<E> {
    private List<E> list = new ArrayList<>();
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean push(E e) {
        return list.add(e);
    }
    
    public E pop() {
        int index = list.size() - 1;
        E e = list.get(index);
        list.remove(index);
        return e;
    }
    
    public String toString() {
        return list.toString();
    }
    
    public static void main(String[] args) {
        // Integer
        Stack<Integer> stackInt = new Stack<>();
        for (int i = 1; i < 10; i++) {
            stackInt.push(i);
        }
        
        System.out.println(stackInt);
        
        for (int i = 1; i < 5; i++) {
            stackInt.pop();
        }
        
        System.out.println(stackInt);
        
        // String
        Stack<String> stackStr = new Stack<>();
        for (int i = 1; i < 10; i++) {
            stackStr.push("String-" + i);
        }
        
        System.out.println(stackStr);
        
        for (int i = 1; i < 5; i++) {
            stackStr.pop();
        }
        
        System.out.println(stackStr);
    }
}