package com.skl.day14.block;

/*
* 类的成员描述：代码块
* 用来初始化类、对象
*
*
* */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);
        Person.info();

    }
}
class  Person {
    String name;
    int age;
    static String desc ="我是一个人";


    //代码块。随着对象的创建而调用
    {
        System.out.println("hello 这是非static代码块");
        age=1;
    }

    //static代码块，随着类的加载而执行
    static{
        System.out.println("hello 这是static代码块");
        desc = "我是一个爱学的人";

    }




    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(" eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个快乐的人。");
    }
}