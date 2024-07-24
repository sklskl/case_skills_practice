package src.com.skl.day07;

/**
 * @program: case_skills_practice
 * @ClassName: BlockTest
 * @author: skl
 * @create: 2024-06-19 16:09
 */
public class BlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();

    }
}
class Person{
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public Person(){
    }
    //代码块
    {
        System.out.println("非静态代码块");
    }
    static {
        System.out.println("静态代码块");
    }
}