package com.test08;

import java.util.HashSet;

/**
 * @program: case_skills_practice
 * @ClassName: TestInteger
 * @author: skl
 * @create: 2024-03-07 13:57
 */
public class TestInteger {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("10");
        System.out.println(hs.add("20"));
        System.out.println(hs.add("20"));
        hs.add("3");
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
