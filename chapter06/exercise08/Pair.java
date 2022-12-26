
public class Pair<E extends Comparable<E>> {
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

    public E max() {
        return (first.compareTo(second) >= 0) ? first : second;
    }

    public E min() {
        return (first.compareTo(second) <= 0) ? first : second;
    }

    public String toString() {
        return getClass().getName() + "[" + first + ", " + second + "]";
    }

    public static void main(String[] args) {
        Pair<Integer> pairInt = new Pair<>(10, 20);
        Pair<String> pairStr = new Pair<>("First", "Second");

        System.out.println(pairInt);
        System.out.println("Max: " + pairInt.max());
        System.out.println("Min: " + pairInt.min());

        System.out.println(pairStr);
        System.out.println("Max: " + pairStr.max());
        System.out.println("Min: " + pairStr.min());
    }
}