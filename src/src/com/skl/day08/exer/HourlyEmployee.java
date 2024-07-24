package src.com.skl.day08.exer;

/**
 * @program: case_skills_practice
 * @ClassName: HourlyEmployee
 * @author: skl
 * @create: 2024-06-25 10:43
 */
public class HourlyEmployee extends MyDate {
    private double wage;//单位小时工资
    private int hours;

    public HourlyEmployee() {
    }

    @Override
    public double earning() {
        return wage * hours;
    }

    public HourlyEmployee(int year, int month, int day, MyDate birthday, double wage, int hours) {
        super(year, month, day, birthday);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }

}
