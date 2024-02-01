package com.skl.day14.sta;

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name="yangmi";
        c1.age=35;
        c1.nation = "china";

        Chinese c2 = new Chinese();
        c2.name="yangzi";
        c2.age=30;
        System.out.println(c2.nation);
    }
}
class Chinese{
    String name;
    int age;
    static String nation;

}