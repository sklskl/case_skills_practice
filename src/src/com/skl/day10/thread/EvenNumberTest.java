package src.com.skl.day10.thread;

import org.junit.experimental.theories.Theories;

/**
 * @program: case_skills_practice
 * @ClassName: EvenNumberTest
 * @author: skl
 * @create: 2024-07-05 10:21
 */
//创建一个继承与thread的子类
class Printer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class EvenNumberTest {
    public static void main(String[] args) {
        //创建当前thread的子类对象
        Printer printer = new Printer();
        //通过evenNumberTest调用start方法
        printer.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i+"******");
            }
        }

    }
}