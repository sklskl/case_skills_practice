package com.test04;

/**
 * @program: case_skills_practice
 * @ClassName: Person
 * @author: skl
 * @create: 2024-05-07 11:07
 */
class Person {
    String name;
    int age;
    char gender;

    public void interests(String hobby){
        System.out.println("喜欢"+hobby);
    }
    public void sleep(int hour){
        System.out.println("睡觉"+hour+"小时");
    }
    public void eat(){
        System.out.println("吃饭");
    }


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

public class Method1Test {
    public static void main(String[] args) {

    }
}