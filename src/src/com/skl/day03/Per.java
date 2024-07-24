package src.com.skl.day03;

/**
 * @program: case_skills_practice
 * @ClassName: Per
 * @author: skl
 * @create: 2024-05-30 16:50
 */
public class Per {
    String name;
    int age;

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

    public Per() {
    }

    public Per(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(int hour){
        System.out.println("睡"+hour+"小时");
    }
}
