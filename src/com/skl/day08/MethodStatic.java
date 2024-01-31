package com.skl.day08;

public class MethodStatic {
    int id;
    static int sid;

    public static void main(String[] args) {
        //创建对象
        MethodStatic m1 = new MethodStatic();
        m1.id = 10;
        m1.sid = 10;
        MethodStatic m2 = new MethodStatic();
        m2.id = 20;
        m2.sid = 20;
        MethodStatic m3 = new MethodStatic();
        m3.id = 30;
        m3.sid = 30;
        System.out.println(m1.id);
        System.out.println(m2.id);
        System.out.println(m3.id);
        System.out.println("-----");
        System.out.println(m1.sid);
        System.out.println(m2.sid);
        System.out.println(m3.sid);
    }
}
