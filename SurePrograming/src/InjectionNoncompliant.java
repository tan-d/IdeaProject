import java.util.Calendar;
import java.util.GregorianCalendar;

public class InjectionNoncompliant {
    class Format {
         Calendar c = new GregorianCalendar(1995, GregorianCalendar.MAY, 23);
        public void main(String[] args) {
// args[0] should contain the credit card expiration date
// but might contain %1$tm, %1$te or %1$tY format specifiers
            System.out.format(args[0] + " did not match! HINT: It was issued on %1$terd of some month", c);
        }
    }
}
