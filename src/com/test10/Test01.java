package com.test10;

import apple.laf.JRSUIUtils;

import java.util.TreeSet;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-07 16:15
 */
public class Test01 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(16);
        treeSet.add(24);
        treeSet.add(95);
        treeSet.add(16);
        treeSet.add(17);
        treeSet.add(78);
        System.out.println(treeSet.size());
        System.out.println(treeSet);

    }
}
