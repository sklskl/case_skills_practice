package com.skl.testinteger;

public class TestIneterger01 {
    public static void main(String[] args) {
        Integer i1= new Integer(12);
        Integer i2= new Integer(20);
        System.out.println(i1.compareTo(i2));
        Integer i3= new Integer(20);
        Integer i4= new Integer(20);
        System.out.println(i3==i4);
        boolean flag = i3.equals(i4);
        System.out.println(flag);
        //integer对象通过自动装箱
    }
}
