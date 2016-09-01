import java.util.Objects;
import java.util.Arrays;

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


public class LabeledPoint extends Point {
  private String label;
  
  public LabeledPoint(String label, double x, double y) {
  	super(x, y);
    this.label = label;
  }
  
  public String getLabel() { return label; }
  
  public double[] getCoordinates() {
  	double[] a = new double[2];
    a[0] = x;
    a[1] = y;
    return a;
  }
  
  public String toString() {
  	return super.toString() + "[label=" + label + "]"; 
  }
  
  public boolean equals(Object other) {
  	if (!super.equals(other)) return false;
    LabeledPoint otherLabeledPoint = (LabeledPoint)other;
    return Objects.equals(label, otherLabeledPoint.label);
  }
  
  public int hashCode() {
  	return Objects.hash(super.hashCode(), label);
  }
  
  public static void main(String[] args) {
  	LabeledPoint lpoint1 = new LabeledPoint("LabeledPoint", 1.0, 1.0);
    System.out.println(lpoint1);
    LabeledPoint lpoint2 = new LabeledPoint("LabeledPoint", 1.0, 1.0);
    System.out.println(lpoint1.equals(lpoint2));
    System.out.println(lpoint1.hashCode());
    System.out.println(lpoint2.hashCode());
    System.out.println(Arrays.toString(lpoint1.getCoordinates()));
    System.out.println(lpoint1.getCoordinates());
  }
}
