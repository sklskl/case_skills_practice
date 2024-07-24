package src.com.skl.day08;

/**
 * @program: case_skills_practice
 * @ClassName: Person
 * @author: skl
 * @create: 2024-06-24 15:23
 */
public abstract class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    public void eat(){
//        System.out.println("吃饭");
//    }
    public  abstract void eat();
    public abstract void breath();
    public void sleep(){
        System.out.println("睡觉");
    }
}
