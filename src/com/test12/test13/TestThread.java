package com.test13;

/**
 * @program: case_skills_practice
 * @ClassName: TestThread
 * @author: skl
 * @create: 2024-04-02 14:44
 */
public class TestThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
