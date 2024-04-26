package com.skl.com.skl.TestOOP5;

public interface TestInterface {
    public static final int NUM=100;
    public abstract void a();
    public default void b(){
        System.out.println("TestInterface----b()");
    }

}
class Test implements TestInterface{

    @Override
    public void a() {

    }

    @Override
    public void b() {
        TestInterface.super.b();
    }
}
