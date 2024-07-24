package src.com.skl.day10.team.domain;

/**
 * @program: case_skills_practice
 * @ClassName: Designer
 * @author: skl
 * @create: 2024-07-01 22:56
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails()  + "\t设计师\t" + getStatus() + "\t" + bonus + "\t" + getEquipment().getDescription();
    }
}
