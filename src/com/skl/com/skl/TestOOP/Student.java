package com.skl.com.skl.TestOOP;

public class Student extends Person{
    double height;
public Student(){

}
    public Student(String name, int age, double height, double height1) {
        super(name, age, height);
        this.height = height1;
    }
}
