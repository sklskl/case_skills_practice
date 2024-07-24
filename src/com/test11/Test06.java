package com.test11;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @program: case_skills_practice
 * @ClassName: Test06
 * @author: skl
 * @create: 2024-03-15 15:45
 */
public class Test06 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个队列，执行长度为3
        ArrayBlockingQueue aq = new ArrayBlockingQueue(3);
        aq.add("1");
        aq.offer("2");
        aq.put("3");
        System.out.println(aq);
        System.out.println(aq.offer("22",2, TimeUnit.SECONDS));
        System.out.println(aq);

    }
}
