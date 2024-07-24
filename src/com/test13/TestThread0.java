package com.test13;

/**
 * @program: case_skills_practice
 * @ClassName: TestThread
 * @author: skl
 * @create: 2024-04-01 11:00
 */
//继承thread才能有争抢资源的能力
public class TestThread0 extends Thread{
    /*争抢资源
    * */
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(super.getName()+i);
        }
    }
}
