import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ch02Ex01 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now().withDayOfMonth(1);
    int month;
    if (args.length >= 2) {        
      month = Integer.parseInt(args[0]);
      int year = Integer.parseInt(args[1]);
      date = LocalDate.of(year, month, 1);
    } else {
      month = date.getMonthValue();
    }
        
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    int value = (date.getDayOfWeek().getValue() + 1) % 7; // 1 = Sunday, ... 7 = Saturday
    
    for (int i = 1; i < value; i++) 
      System.out.print("    ");
    
    while (date.getMonthValue() == month) {
      System.out.printf("%4d", date.getDayOfMonth());
      date = date.plusDays(1);
      value = (date.getDayOfWeek().getValue() + 1) % 7;
      if (value == 1) 
        System.out.println();
    }
      
    value = (date.getDayOfWeek().getValue() + 1) % 7;
    if (value != 1) 
      System.out.println();
  }
}
