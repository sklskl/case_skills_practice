package com.skl.day15.abstractTest;
/*
* abstract 关键字的使用
* 1、abstract 抽象的
* 2、abstract 可以修饰的结构；类、方法
* 3、abstract 修饰类，：抽象类
*     不能实例化
* */

public class Person {
    public static void main(String[] args) {
        Peo p1 = new Peo();
        p1.eat();

    }
}

class Peo {
    String name;
    int age;

    public Peo() {
    }

    public Peo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println("人在走路");
    }
    public void eat(){
        System.out.println("人在吃饭");
    }
}
class Student extends Peo{

    public Student(String name, int age) {
        super(name, age);
    }
}
