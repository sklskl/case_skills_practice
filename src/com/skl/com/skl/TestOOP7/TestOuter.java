package com.skl.com.skl.TestOOP7;

public class TestOuter {
    public   class D{

    }
    //成员内部类
//    class D{
//
//    }
    //静态成员内部类
    static class E{

    }
    int age;
    public void a(){
        System.out.println("这是a方法。");
        {
            System.out.println("这是一个普通块。");
        }
    }
    static {
        System.out.println("这是静态块");
    }
    {
        System.out.println("这是一个构造块");
    }
    public TestOuter(){

    }

    public TestOuter(int age) {
        this.age = age;
    }
}
