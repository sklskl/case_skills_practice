package src.com.skl.day05;

/**
 * @program: case_skills_practice
 * @ClassName: ManKind
 * @author: skl
 * @create: 2024-06-05 11:21
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else {
            System.out.println("woman");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("unemployeed");
        } else {
            System.out.println("employeed");
        }
    }
}
