package src.com.skl.day06;

/**
 * @program: case_skills_practice
 * @ClassName: MyRectangle
 * @author: skl
 * @create: 2024-06-18 11:03
 */
public class MyRectangle extends GeometriObject{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle(String color, boolean weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }
    @Override
    public double findArea() {
        return width*height;
    }
}
