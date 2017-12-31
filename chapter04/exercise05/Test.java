import java.util.Objects;

class Point implements Cloneable {
    protected double x, y;
  
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
  
    public double getX() { return x; }
    public double getY() { return y; }
  
    public String toString() {
        return getClass().getName() + "[x=" + x + ", y=" + y + "]";
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
  
    public Point clone() {
        return new Point(x, y);
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
  
    public String toString() {
        return getClass().getName() + "[x=" + point.getX() + ", y=" + point.getY() + "]";
    }
  
    public abstract Point getCenter();
}


class Circle extends Shape implements Cloneable {
    private double radius;
  
    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }
  
    public Point getCenter() { return point; }
  
    public String toString() {
        return super.toString() + "[radius=" + radius + "]";
    }
  
    public Circle clone() {
        return new Circle(point.clone(), radius);
    }
}

class Rectangle extends Shape implements Cloneable {
    private double width, height;
  
    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }
  
    public Point getCenter() {
        double x = (point.getX() + width) / 2;
        double y = (point.getY() + height) / 2;
        return new Point(x, y);
    }
  
    public String toString() {
        return super.toString() + "[width=" + width + ", height=" + height + "]";
    }
  
    public Rectangle clone() {
        return new Rectangle(point.clone(), width, height);
    }
}
 
class Line extends Shape  implements Cloneable {
    private Point to;
  
    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }
  
    public void moveBy(double dx1, double dy1, double dx2, double dy2) {
        double x1 = point.getX();
        double y1 = point.getY();
        double x2 = to.getX();
        double y2 = to.getY();
        point = new Point(x1 + dx1, y1 + dy1);
        to = new Point(x2 + dx2, y2 + dy2);
    }
  
    public Point getCenter() {
        double x = (point.getX() + to.getX()) / 2;
        double y = (point.getY() + to.getY()) / 2;
  	    return new Point(x, y);
    }
  
    public String toString() {
        return getClass().getName() + "[from.x=" + point.getX() + ", from.y=" + 
            point.getY() + ", to.x=" + to.getX() + ", to.y=" + to.getY() + "]";
    }
  
    public Line clone() {
        return new Line(point.clone(), to.clone());
    }
}

public class Test {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        Circle circle = new Circle(point, 1.0);
        System.out.println(circle);
        System.out.println(circle.getCenter());
        Circle clonedCircle = circle.clone();
        circle.moveBy(1.5, 1.5);
        System.out.println(circle);
        System.out.println(clonedCircle);

        Point topLeft = new Point(0, 0);
        Rectangle rectangle = new Rectangle(topLeft, 1.5, 3.4);
        System.out.println(rectangle);
        System.out.println(rectangle.getCenter());
        Rectangle clonedRectangle = rectangle.clone();
        rectangle.moveBy(1.6, 1.6);
        System.out.println(rectangle);
        System.out.println(clonedRectangle);

        Point from = new Point(0, 0);
        Point to = new Point(1, 1);
        Line line = new Line(from, to);
        System.out.println(line);
        System.out.println(line.getCenter());
        Line clonedLine = line.clone();
        line.moveBy(1.7, 1.7, 2.0, 2.0);
        System.out.println(line);
        System.out.println(clonedLine);
    }
}
