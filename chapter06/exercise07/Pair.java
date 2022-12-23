
public class Pair<E> {
    private final E first;
    private final E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second; 
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public String toString() {
        return getClass().getName() + "[" + first + ", " + second + "]";
    }

    public static void main(String[] args) {
        Pair<Integer> pairInt = new Pair<>(10, 20);
        Pair<String> pairStr = new Pair<>("First", "Second");

        System.out.println(pairInt);
        System.out.println(pairStr);
    }
}