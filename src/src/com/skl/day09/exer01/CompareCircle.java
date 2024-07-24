package src.com.skl.day09.exer01;

/**
 * @program: case_skills_practice
 * @ClassName: CompareCircle
 * @author: skl
 * @create: 2024-06-26 14:18
 */
public class CompareCircle extends Circle implements CompareObject {
    public CompareCircle() {
    }

    public CompareCircle(double radius) {
        super(radius);
    }


    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareCircle) {
            CompareCircle circle = (CompareCircle) o;
            if (this.getRadius() > circle.getRadius())
                return 1;
            else if (this.getRadius() < circle.getRadius())
                return -1;
            else
                return 0;
        }
        return 0;
    }
}
