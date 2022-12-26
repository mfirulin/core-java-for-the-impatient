import java.util.List;

public class Arrays {
    public static <E> Pair<E> firstLast(List<E> a) {
        return new Pair<E>(a.get(0), a.get(a.size() - 1));
    }
}