package src.com.skl.day06;

/**
 * @program: case_skills_practice
 * @ClassName: ChineseTest
 * @author: skl
 * @create: 2024-06-18 16:36
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chinese chinese01 = new Chinese();
        chinese01.name = "张三";
        chinese01.age = 18;
        chinese01.nation = "中国";
        Chinese chinese02 = new Chinese();
        chinese02.name = "李四";
        chinese02.age = 19;
        System.out.println(chinese01);
        System.out.println(chinese02);
    }
}

class Chinese {
    String name;
    int age;
    static String nation;

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

    @Override
    public String toString() {
        return "姓名：" + name + "年龄：" + age;
    }

}