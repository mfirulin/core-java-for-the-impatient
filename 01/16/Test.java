public class Test {
    private static double average(double a, double... values) {
        double sum = a;
        for (double x : values) sum += x;
        return values.length > 0 ? sum / values.length : a;
    }
    
    public static void main(String[] args) {
        System.out.println(average(-1, 3.14));
        System.out.println(average(2, 1));
        System.out.println(average(-3, 4.5, 10.11, 0));
    }
}
