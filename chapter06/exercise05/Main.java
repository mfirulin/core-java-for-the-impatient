import java.util.Arrays;

public class Main {
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    public static void main(String[] args) {
        Double[] result = Main.<Double>swap(0, 1, 1.0, 2.0, 3.0);
        System.out.println(Arrays.toString(result));
    }
}