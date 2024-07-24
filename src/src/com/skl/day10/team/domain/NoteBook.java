package src.com.skl.day10.team.domain;

/**
 * @program: case_skills_practice
 * @ClassName: NoteBook
 * @author: skl
 * @create: 2024-07-01 22:36
 */
public class NoteBook implements Equipment {
    private String model;//机器型号
    private double price;//

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
