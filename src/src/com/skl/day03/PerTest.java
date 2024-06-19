package src.com.skl.day03;

/**
 * @program: case_skills_practice
 * @ClassName: PerTest
 * @author: skl
 * @create: 2024-05-30 16:53
 */
public class PerTest {
    public static void main(String[] args) {
        Per per = new Per();
        per.setName("skl");
        per.setAge(18);
        System.out.println("name:"+per.getName()+",age: "+per.getAge());
        per.eat();
        per.sleep(8);
    }
}
