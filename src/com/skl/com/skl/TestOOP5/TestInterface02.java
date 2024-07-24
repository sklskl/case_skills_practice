package com.skl.com.skl.TestOOP5;

public interface TestInterface02 {
    public static final int NUM =10;
    public abstract void a();
    public default void b(){
        System.out.println("TestInterface02---b()--");
    }
    public static void c(){
        System.out.println("TestInterface02---c()--");

    }
}
class Demo implements TestInterface02{
    @Override
    public void a() {
        TestInterface02.super.b();
    }

    @Override
    public void b() {
        TestInterface02.super.b();
    }
    public static void c(){
        System.out.println("Demo---c()--");

    }

}
class A{
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.c();
    }
}