package com.skl.day08;

public class PersonTest {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.eat();
        Person person = new Person();
        person.name = "skl";
        person.age = 18;
        person.sex = 1;
        person.study();
        person.showAge();
        int new_age = person.addAge(2);
        System.out.println(person.name+"的新年龄为："+new_age);
    }
}
//class Person {
//    //属性
//    String name;
//    int age = 1;
//    boolean isMale;
//    //方法
//    public void eat(){
//        System.out.println("人可以吃饭");
//    }
//    public void sleep(){
//        System.out.println("人可以睡觉");
//    }
//    public void talk(String language){
//        System.out.println("人可以说话,使用的是："+language);
//    }
//}