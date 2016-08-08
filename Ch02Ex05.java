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
  
  public Point translate(double a, double b) {
  	return new Point(x + a, y + b);
  }
  
  public Point scale(double c) {
  	return new Point(x*c, y*c);
  }
  
  
  public static void main(String[] args) {
  	Point p = new Point(3, 4).translate(1, 3).scale(0.5);
    System.out.println(p.getX() + " " + p.getY());
    p = new Point().translate(-1, 3).scale(2.5);
    System.out.println(p.getX() + " " + p.getY());
  }
}
