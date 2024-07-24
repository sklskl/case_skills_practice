package src.com.skl.day10.team.domain;

/**
 * @program: case_skills_practice
 * @ClassName: Architect
 * @author: skl
 * @create: 2024-07-01 22:58
 */
public class Architect extends Designer{
    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String toString(){
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus()
                + "\t" + stock + "\t" + getEquipment().getDescription();
    }
}
