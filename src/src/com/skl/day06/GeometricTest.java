package src.com.skl.day06;

/**
 * @program: case_skills_practice
 * @ClassName: GeometricTest
 * @author: skl
 * @create: 2024-06-18 11:12
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red",true,5);
        test.displayObject(c1);
    }
    public boolean equalsArea(GeometriObject o1, GeometriObject o2){
        return o1.findArea() == o2.findArea();
    }
    public void displayObject(GeometriObject o){
        System.out.println("几何图形的面积"+o.findArea());
    }
}
