/**
 * Class <code>Point</code> presents a geometric point
 * in the plane. No modifying methods.
 * @author Mikhail Firulin
 * @version 1.0
 * /
public class Point {
  private double x, y;
  
  /**
   * Create a point with predefined coordinates.
   * @param x X-coordinate
   * @param y Y-coordinate
   * /
  public Point(double x, double y) {
  	this.x = x;
    this.y = y;
  }
  
  /**
   * Create a point with default coordinates 0, 0.
   * /
  public Point() {
  	this(0, 0);
  }
  
  /**
   * Get an X-coordinate.
   * @return X-coordinate
   * /
  public double getX() {
  	return x;
  }
  
   /**
   * Get a Y-coordinate.
   * @return Y-coordinate
   * / 
  public double getY() {
  	return y;
  }
  
  /**
   * Move a point to new coordinates, return a new point. 
   * The original point is not changed.
   * @param a X-coordinate shift
   * @param b Y-coordinate shift
   * @return A point with new coordinates
   * /
  public Point translate(double a, double b) {
  	return new Point(x + a, y + b);
  }
  
  /** Scale coordinates according to a coefficient, return a new point. 
   * The original point is not changed.
   * @param c Coefficient of scaling 
   * @return A point with new coordinates
   * /
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
