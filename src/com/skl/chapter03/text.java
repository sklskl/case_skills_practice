package com.skl.chapter03;

public class text {
    public static void main(String[] args) {
       StringBuffer a = new StringBuffer("A");
       StringBuffer b = new StringBuffer("B");
       operate(a,b);
        System.out.println(a+","+b);
    }

    static void operate(StringBuffer a, StringBuffer b) {
        a.append(b);
        b = a;
    }
}
