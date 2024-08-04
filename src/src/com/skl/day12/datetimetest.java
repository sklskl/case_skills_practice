package src.com.skl.day12;

import java.time.LocalDateTime;

/**
 * @program: case_skills_practice
 * @ClassName: datetimetest
 * @author: skl
 * @create: 2024-08-04 19:45
 */
public class datetimetest {
    public void test() {
        String s1 = "hello";
        String s2 = s1.replace("l", "w");
        System.out.println(s2);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    public static void main(String[] args) {
datetimetest test = new datetimetest();
test.test();
    }


}
