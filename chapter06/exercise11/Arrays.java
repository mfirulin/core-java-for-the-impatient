import java.util.List;

public class Arrays {
    public static <E extends Comparable<E>> Pair<E> minMax(List<E> a) {
        a.sort((x, y) -> x.compareTo(y));
        return new Pair<E>(a.get(0), a.get(a.size() - 1));
    }
}