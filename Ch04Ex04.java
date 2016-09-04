import java.util.Objects;

class Point {
  protected double x, y;
  
  public Point(double x, double y) {
  	this.x = x;
    this.y = y;
  }
  
  public double getX() { return x; }
  public double getY() { return y; }
  
  public String toString() {
  	return getClass().getName() + "[x=" + x + ",y=" + y + "]";
  }
  
  public boolean equals(Object other) {
    if (other == this) return true;
    if (other == null) return false;
    if (other.getClass() != getClass()) return false;
    Point otherPoint = (Point)other;
    return x == otherPoint.x && y == otherPoint.y;
  }
  
  public int hashCode() {
  	return Objects.hash(x, y);
  }
}


abstract class Shape {
  protected Point point;
  
  public Shape(Point point) {
  	this.point = point;
  }
  
  public void moveBy(double dx, double dy) {
  	double x = point.getX();
    double y = point.getY();
    point = new Point(x + dx, y + dy);
  }
  
  public abstract Point getCenter();
}

class Circle extends Shape {
  private double radius;
  
  public Circle(Point center, double radius) {
    super(center);
    this.radius = radius;
  }
  
  public Point getCenter() { return point; }
}

public class Ch04Ex04 {
  public static void main(String[] args) {
    Point point = new Point(0, 0);
    Circle circle = new Circle(point, 1.0);
    circle.moveBy(1.0, 1.0);
  }
}
