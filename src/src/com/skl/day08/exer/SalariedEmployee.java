package src.com.skl.day08.exer;

/**
 * @program: case_skills_practice
 * @ClassName: SalariedEmployee
 * @author: skl
 * @create: 2024-06-24 23:09
 */
public class SalariedEmployee extends MyDate{
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(int year, int month, int day, MyDate birthday, double monthlySalary) {
        super(year, month, day, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public String toString(){
        return "SalariedEmployee{" +
                "monthlySalary=" + super.toString() +
                '}';
    }

    @Override
    public double earning() {
        return monthlySalary;
    }
}
