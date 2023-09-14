package com.skl.testOOP;

public class Person {
    public String name;
    double height;
    int age;
    double weight;

    public void eat(){
        System.out.println("我喜欢吃东西");
    }

    public void sleep(String address){
        System.out.println("我喜欢在"+address+"睡觉。");
    }

    public String introduce(){
        return ("我的名字："+name+"，我"+age+"岁了，我的身高："+height+"cm，我的体重是："+weight);
    }
}
