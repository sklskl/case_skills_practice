package com.test13;

/**
 * @program: case_skills_practice
 * @ClassName: Test01Thread
 * @author: skl
 * @create: 2024-04-01 16:17
 */
public class Test01Thread {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("main---" + i);
        }

        TestThread0 t = new TestThread0();
        t.setName("子线程");
        t.run();

    }
}
