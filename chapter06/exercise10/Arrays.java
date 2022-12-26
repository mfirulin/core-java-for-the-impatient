import java.util.List;

public class Arrays {
    public static <E extends Comparable<E>> E min(List<E> a) {
        E v = a.get(0);
        for (E e : a) {
            if (v.compareTo(e) > 0) {
                v = e;
            }
        }
        return v;
    }

    public static <E extends Comparable<E>> E max(List<E> a) {
        E v = a.get(0);
        for (E e : a) {
            if (v.compareTo(e) < 0) {
                v = e;
            }
        }
        return v;
    }
}