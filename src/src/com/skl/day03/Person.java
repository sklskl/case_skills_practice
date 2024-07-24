package src.com.skl.day03;

/**
 * @program: case_skills_practice
 * @ClassName: Person
 * @author: skl
 * @create: 2024-05-30 15:52
 */
public class Person {
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.out.println("年龄不合法");
        }else {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        System.out.println("Person{age=" + age + "}");
        return null;
    }
}
