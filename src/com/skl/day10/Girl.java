package com.skl.day10;

public class Girl {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()  {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Girl() {
    }
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }
    public int compare(Girl girl){
        return this.age - girl.age;
    }
}
