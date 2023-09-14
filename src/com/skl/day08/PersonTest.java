package com.skl.day08;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
    }
}
class Person {
    //属性
    String name;
    int age = 1;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话,使用的是："+language);
    }
}