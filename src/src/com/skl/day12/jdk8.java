package src.com.skl.day12;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: case_skills_practice
 * @ClassName: jdk8
 * @author: skl
 * @create: 2024-07-18 20:53
 */
public class jdk8 {
    @Test
    public void test1(){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
    }
    @Test
    public void test2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        Date date = simpleDateFormat.parse("2024-07-18 20:53:00");
        System.out.println(date);
    }
}
