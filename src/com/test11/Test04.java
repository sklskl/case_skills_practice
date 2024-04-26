package com.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: case_skills_practice
 * @ClassName: Test04
 * @author: skl
 * @create: 2024-03-13 14:28
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 1000; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    list.add("a");
                }
            });
        }
        service.shutdown();
        while (true) {
            if (service.isTerminated()) {
                System.out.println("所有线程豆执行完毕了");
                System.out.println(list.size());
            }

        }
    }
}
