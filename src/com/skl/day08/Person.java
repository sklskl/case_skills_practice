package com.skl.day08;

public class Person {
    String name;
    int age;
    double height;
//    double weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void study(){
        System.out.println("studying");
    }
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
    public int addAge(int a){
        age += a;
        return age;
    }
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉。");
    }
    //自我介绍
    public String introduce(){
        return "我的名字："+name+",年龄："+age+",身高："+height+"。";
    }


}
