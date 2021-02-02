//Съвместимото решение изключва ненадежден потребителски вход от форматния низ, въпреки че arg [0] все още може да съдържа един или повече спецификатори на формат, те сега са инертни.

import java.util.Calendar;
import java.util.GregorianCalendar;

class Format {
    static Calendar c = new GregorianCalendar(1995, GregorianCalendar.MAY, 23);
    public static void main(String[] args) {
// args[0] is the credit card expiration date
// Perform comparison with c,
// if it doesn't match, print the following line
        System.out.format("%s did not match! HINT: It was issued on %terd of some month", args[0], c);
    }
}