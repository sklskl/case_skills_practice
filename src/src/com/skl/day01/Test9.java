package src.com.skl.day01;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test9 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);
        LocalDate of = LocalDate.of(2024,2,19);
        LocalTime ltof = LocalTime.of(12,35,56);
        System.out.println(of);
    }
}
