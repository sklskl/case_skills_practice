package com.skl.com.skl.TestOOP3;

public abstract class Person {
    public void eat(){
        System.out.println("吃饭的方法");
    }
//    public void say(){
//        System.out.println("说话的方法");
//    }
    /*抽象方法没有方法体
    * 一个方法是抽象方法
    * */
    public abstract void say();
}

class Student extends Person{

    @Override
    public void say() {

    }
}