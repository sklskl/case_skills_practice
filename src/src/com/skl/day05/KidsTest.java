package src.com.skl.day05;

import com.skl.day12.java4.Main;

/**
 * @program: case_skills_practice
 * @ClassName: KidsTest
 * @author: skl
 * @create: 2024-06-05 14:19
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids();
        kids.setSalary(1000);
        kids.setSex(1);
        kids.setYearsOld(18);
        //父类中的方法
        kids.manOrWoman();
        kids.employeed();
        //子类
        kids.printAge();
    }
}
