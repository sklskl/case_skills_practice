package src.com.skl.day08;

/**
 * @program: case_skills_practice
 * @ClassName: Student
 * @author: skl
 * @create: 2024-06-24 15:33
 */
public class Student extends Person{
    String school;

    public Student() {
    }
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void eat(){
        System.out.println("学生吃饭，长身体");
    }

    @Override
    public void breath() {
        System.out.println("学生呼吸新鲜空气");
    }

    public void sleep(){
        System.out.println("学生睡觉,保证充足睡眠");
    }
}
