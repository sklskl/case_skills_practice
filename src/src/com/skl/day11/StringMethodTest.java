package src.com.skl.day11;

import org.junit.Test;

/**
 * @program: case_skills_practice
 * @ClassName: StringMethodTest
 * @author: skl
 * @create: 2024-07-15 11:05
 */
public class StringMethodTest {
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String();
        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);
    }
    @Test
    //String与基本数据类型的转换
    public void test2() {
        int num =10;
        //1
        String str1 = num + "";
        //2
        String str2 = String.valueOf(num);
        String s3 = "123";
        int i1 = Integer.valueOf(s3);
    }
    @Test
    public void test3() {
        String s1 = "hello";
        char [] c = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    @Test
    public void test4() {
        String s1 = new String("hello");
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

    }
    @Test
    public void test5() {
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
        String s5="hello";
    }
    //equalesIgnore
    @Test
    public void test6() {
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    @Test
    public void test7() {
        String s1 = "鲁商集团有限公司";
        String s2 = "商集";

        System.out.println(s1.contains("商集"));
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.substring(2));
    }
}
