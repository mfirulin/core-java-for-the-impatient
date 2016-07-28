/*
if (f.fin1 >= 0) && (f.fin1 <= 360) 
  set f.fout to f.fin1 
else 
  if f.fin1 < 0 
   set f.fin1 to (f.fin1 + 360) 
  else 
   set f.fin1 to (f.fin1 - 360) 
  endif
endif
*/

import java.util.Scanner;


public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter an angle: ");
    int a = in.nextInt();
    // Realization with floorMod()
    System.out.println(Math.floorMod(angle, 360));
    // Realization with '%'
    if (angle > 0)
    	System.out.println(angle % 360);
  }
}
