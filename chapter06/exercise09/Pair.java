
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
}