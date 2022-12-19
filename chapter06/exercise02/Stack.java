public class Stack<E> {
    private static final int SIZE = 5;
    private Object[] list = new Object[SIZE];
    private int numberOfElements;
    
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }
    
    public boolean push(E e) {
        if (list.length == numberOfElements) {
            Object[] tempList = new Object[list.length + SIZE];
            for (int i = 0; i < list.length; i++) {
                tempList[i] = list[i];
            }
            list = tempList;
        }
        list[numberOfElements++] = e;
        return true;
    }
    
    @SuppressWarnings("unchecked")
    public E pop() {
        E e = null;
        if (numberOfElements > 0) {
            e = (E)list[--numberOfElements]; 
        }
        return e;
    }

    public String toString() {
        var builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < numberOfElements; i++) {
            builder.append(list[i].toString());
            builder.append(", ");
        }
        
        // Remove last ", "
        builder.delete(builder.length() - 2, builder.length());
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
            stackStr.push("String-" + i);
        }
        
        System.out.println(stackStr.toString());

        for (int i = 1; i < 5; i++) {
            stackStr.pop();
        }

        System.out.println(stackStr.toString());
    }
}