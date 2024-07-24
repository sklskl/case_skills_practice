package src.com.skl.day01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test06 {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        Calendar c2 = Calendar.getInstance();
        System.out.println(c2);
        System.out.println(c.get(Calendar.YEAR));
    }
}
