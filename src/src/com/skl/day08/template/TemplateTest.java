package src.com.skl.day08.template;

/**
 * @program: case_skills_practice
 * @ClassName: TemplateTest
 * @author: skl
 * @create: 2024-06-24 16:40
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        printNumber.spendTime();
    }
}

abstract class Template {
    //测试某段代码花费的时间
    public void spendTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));
    }

    public abstract void code();
}

class PrintNumber extends Template {
    @Override
    public void code() {
        for (int i = 0; i < 100000; i++) {
            boolean isFLag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFLag = false;
                    break;
                }
            }
            if (isFLag) {
                System.out.println(i);
            }
        }
    }
}