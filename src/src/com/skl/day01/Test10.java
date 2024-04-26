package src.com.skl.day01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test10 {
    public static void main(String[] args) {
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dtf1);
        //localdatetime--->string
        LocalDateTime now = LocalDateTime.now();
        String str = dtf1.format(now);
        System.out.println(str);
        DateTimeFormatter.ofPattern("yyyy-MM-DD");
    }
}
