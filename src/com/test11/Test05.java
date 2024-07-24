package com.test11;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: case_skills_practice
 * @ClassName: Test05
 * @author: skl
 * @create: 2024-03-14 10:39
 */
public class Test05 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long start_time =System.currentTimeMillis();

                    for (int j = 0; j < 1000; j++) {
                        map.put("test01"+j,j);
                    }
                    long end_time = System.currentTimeMillis();
                    System.out.println("耗时："+(end_time-start_time));

                }

            }).start();
        }
    }
}
