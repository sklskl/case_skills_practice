package src.com.skl.day09.exer01;

/**
 * @program: case_skills_practice
 * @ClassName: Circle
 * @author: skl
 * @create: 2024-06-26 14:17
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


}
