package src.com.skl.day05;

/**
 * @program: case_skills_practice
 * @ClassName: Kids
 * @author: skl
 * @create: 2024-06-05 13:58
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {
        super();
        this.yearsOld = 0;
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }
    public void printAge()
    {
        System.out.println("I am "+yearsOld+" years old.");
    }
}
