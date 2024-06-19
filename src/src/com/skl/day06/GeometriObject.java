package src.com.skl.day06;

/**
 * @program: case_skills_practice
 * @ClassName: GeometriObject
 * @author: skl
 * @create: 2024-06-18 10:19
 */
public class GeometriObject {
    protected String color;
    protected boolean weight;

    public GeometriObject(String color, boolean weight) {
        this.color = color;
        this.weight = weight;
    }

    public GeometriObject() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWeight() {
        return weight;
    }

    public void setWeight(boolean weight) {
        this.weight = weight;
    }
    public double findArea(){
        return 0;
    }
}
