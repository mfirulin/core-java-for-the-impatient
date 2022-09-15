class Point {
    private double x, y;
  
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
  
    public double getX() { return x; }
    public double getY() { return y; }
}


public class LabeledPoint extends Point {
    private String label;
  
    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
  
    public String getLabel() { return label; }
  
    public static void main(String[] args) {
        LabeledPoint lp = new LabeledPoint("Point", 1.0, 1.0);
        System.out.println(lp.getLabel() + " " + lp.getX() + " " + lp.getY());
    }
}
