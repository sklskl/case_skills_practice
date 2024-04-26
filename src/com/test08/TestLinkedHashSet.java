package com.test08;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @program: case_skills_practice
 * @ClassName: TestLinkedHashSet
 * @author: skl
 * @create: 2024-03-07 14:35
 */
public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(1);
        hs.add(10);
        System.out.println(hs.add(20));
        System.out.println(hs.add(20));
        hs.add(3);
        System.out.println(hs.size());
        System.out.println(hs);
    }

}
