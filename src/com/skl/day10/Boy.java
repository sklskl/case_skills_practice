package com.skl.day10;

public class Boy {
    private String name;
    private int age;

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
    public  void marry(Girl girl){
        System.out.println("我想娶，"+girl.getName());
    }
    public void shout(){
        if(this.age>22){
            System.out.println("你可以合法登记了");
        }else {
            System.out.println("继续谈恋爱吧。");
        }
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
