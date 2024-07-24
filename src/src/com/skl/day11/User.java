package src.com.skl.day11;

import org.junit.Test;

/**
 * @program: case_skills_practice
 * @ClassName: StringDemo
 * @author: skl
 * @create: 2024-07-12 10:46
 */
public class User {


    /*模拟一个用户类，属性为用户名和密码，提供相关的setget方法，构造器，tustring
            使用数组存储多个用户对象
            录入密码，对比用户信息，佩佩成功登录成功，否则登录失败

            *
            * */

    private String name;
    private String password;

    public User() {
    }

     User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "-'" + password;

    }

    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//f
        System.out.println(s3 == s4);//f
        System.out.println(s1.equals(s2));//t
        System.out.println(s1.equals(s3));//t
        System.out.println(s3.equals(s4));//t
    }

    @Test
    public void test2() {
        Person p1 = new Person();
        p1.name = "skl";
        Person p2 = new Person();
        p2.name = "skl";
        p1.name = "Tom";
        System.out.println("P2.name:" + p2.name);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s6 = "hello" + s2;
        String s5 = s1 + "world";
        String s7 = s1 + s2;
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s6 == s5);
        System.out.println(s6 == s7);

    }
}

class Person {
    String name;

}
