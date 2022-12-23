import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static <T> void merge(List<T> to, List<? extends T> from) {
        to.addAll(from);
    }

    public static void main(String[] args) {
        List<Object> to = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> from = Arrays.asList("C", "D");

        merge(to, from);
        System.out.println(to);
    }
}