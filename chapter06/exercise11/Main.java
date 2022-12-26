import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInt = java.util.Arrays.asList(30, 10, 50, 40, 20);
        System.out.println(Arrays.minMax(listInt));

        List<String> listStr = java.util.Arrays.asList("D", "B", "C", "E", "A");
        System.out.println(Arrays.minMax(listStr));
    }
}