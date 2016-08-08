import org.omg.CORBA.IntHolder;

public class Ch02Ex04 {
  private static void swap(IntHolder a, IntHolder b) {
  	int t = a.value;
    a.value = b.value;
    b.value = t;
  }
  
  public static void main(String[] args) {
	IntHolder a = new IntHolder(1);
    IntHolder b = new IntHolder(2);
    
    System.out.printf("%d %d\n", a.value, b.value);
    swap(a, b);
    System.out.printf("%d %d\n", a.value, b.value);
  }
}
