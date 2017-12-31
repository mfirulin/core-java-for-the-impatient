enum Color {
	BLACK,
  	RED,
  	BLUE,
  	GREEN,
  	CYAN,
  	MAGENTA,
  	YELLOW,
  	WHITE;
    
  	public static Color getRed() { return RED; }
  	public static Color getBlue() { return BLUE; }
  	public static Color getGreen() { return GREEN; }
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
		for (Color c : Color.values())
      		System.out.println(c);
    
   		System.out.println(Color.getRed());
    	System.out.println(Color.getBlue());
    	System.out.println(Color.getGreen());
    
    	func(Color.RED);
    	func(Color.WHITE);
  	}
}
