package com.skl.day10;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("skl");
        person.setAge(18);
        person.eat();



    }
}
class Person {
    private String name;
    private int age ;
    public void eat(){
        System.out.println("eat--");
        this.study();
    }
    public void study(){
        System.out.println("study--");
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
