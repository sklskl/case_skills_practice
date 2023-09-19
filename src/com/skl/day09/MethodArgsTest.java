package com.skl.day09;

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest methodArgsTest = new MethodArgsTest();
        methodArgsTest.show(1);
        methodArgsTest.show("hello");
    }
    public void show(int i){

    }
//    public void show(String s){
//
//    }
    public void show(String... s){
        System.out.println("123");
    }

}
