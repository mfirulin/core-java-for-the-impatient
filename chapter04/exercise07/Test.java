import java.util.Arrays;

enum Color {
    BLACK(0, 0, 0),
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0),
    CYAN(0, 255, 255),
    MAGENTA(255, 0, 255),
    YELLOW(255, 255, 0),
    WHITE(255, 255, 255);
	
	private int r, g, b;
	
	Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
    
    public int getRed() { return r; }
    public int getBlue() { return g; }
    public int getGreen() { return b; }
	public int[] getRGB() { return new int[] {r, g, b}; }
}

public class Test {
    private static void func(Color color) {
    	switch (color) {
            case RED: System.out.println("Red"); break;
      	    case BLUE: System.out.println("Blue"); break;
      	    case GREEN: System.out.println("Green"); break;
      	    default: System.out.println("Another color");
        }
    }
  
    public static void main(String[] args) {
		for (Color color : Color.values()) {
			System.out.println(color + ": " + Arrays.toString(color.getRGB()));
		}
		
		func(Color.RED);
		func(Color.WHITE);
    }
}
