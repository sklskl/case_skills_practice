package src.com.skl.day09;

/**
 * @program: case_skills_practice
 * @ClassName: EatableTest
 * @author: skl
 * @create: 2024-06-26 13:55
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new Indian();
        eatables[1] = new Chinese();
        eatables[2] = new American();
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
