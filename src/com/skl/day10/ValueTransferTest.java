package com.skl.day10;

public class ValueTransferTest {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        ValueTransferTest valueTransferTest = new ValueTransferTest ();
        valueTransferTest.change(s1);
        System.out.println(s1);

    }
    public void change(String s ){
        s = "hi~~~";
    }
}
