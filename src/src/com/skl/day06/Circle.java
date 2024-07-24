package src.com.skl.day06;

/**
 * @program: case_skills_practice
 * @ClassName: Circle
 * @author: skl
 * @create: 2024-06-18 10:43
 */
public class Circle extends GeometriObject{
    private double radius;

    public Circle(String color, boolean weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
