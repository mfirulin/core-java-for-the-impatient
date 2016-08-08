
public class Point {
  private double x, y;
  
  public Point(double x, double y) {
  	this.x = x;
    this.y = y;
  }
  
  public Point() {
  	this(0, 0);
  }
  
  public double getX() {
  	return x;
  }
  
  public double getY() {
  	return y;
  }
  
  public void translate(double a, double b) {
  	x += a;
    y += b;
  }
  
  public void scale(double c) {
  	x *= c; 
    y *= c;
  }
  
  
  public static void main(String[] args) {
  	Point p = new Point(3, 4);
    p.translate(1, 3);
    p.scale(0.5);
    System.out.println(p.getX() + " " + p.getY());
  }
}
