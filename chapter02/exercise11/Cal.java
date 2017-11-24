import java.time.LocalDate;
import static java.time.LocalDate.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Cal {
    public static void main(String[] args) {
        LocalDate date = now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {
            month = parseInt(args[0]);
            int year = parseInt(args[1]);
            date = of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }

        out.println(" Sun Mon Tue Wed Thu Fri Sat");
        int value = date.getDayOfWeek().getValue() % 7 + 1; // 1 = Sunday, ... 7 = Saturday

        for (int i = 1; i < value; i++) out.print("    ");

        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            value = date.getDayOfWeek().getValue() % 7 + 1;
            if (value == 1) out.println();
        }

        value = date.getDayOfWeek().getValue() % 7 + 1;
        if (value != 1) out.println();
    }
}
