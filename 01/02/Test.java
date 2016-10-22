import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an angle: ");
        int angle = in.nextInt();
        
        // Realization with floorMod()
        System.out.println(Math.floorMod(angle, 360));
        
        // Realization with '%'
        angle %= 360;
        if (angle < 0)
            angle += 360;
        System.out.println(angle);
    }
}
