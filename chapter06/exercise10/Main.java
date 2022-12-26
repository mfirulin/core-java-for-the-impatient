import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInt = java.util.Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(Arrays.min(listInt));
        System.out.println(Arrays.max(listInt));

        List<String> listStr = java.util.Arrays.asList("A", "B", "C", "D", "E");
        System.out.println(Arrays.min(listStr));
        System.out.println(Arrays.max(listStr));
    }
}