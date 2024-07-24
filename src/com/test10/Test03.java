package com.test10;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @program: case_skills_practice
 * @ClassName: Test03
 * @author: skl
 * @create: 2024-03-07 16:43
 */
public class Test03 {
    public static void main(String[] args) {
        Comparator <Student> ts = new Bijiao();
        TreeSet<Student> treeSet = new TreeSet<>(ts);
        treeSet.add(new Student(12,"aaa"));
        treeSet.add(new Student(13,"bbb"));
        treeSet.add(new Student(14,"ccc"));
        treeSet.add(new Student(100,"eee"));
        treeSet.add(new Student(13,"fff"));
        treeSet.add(new Student(84,"ggg"));
        System.out.println(treeSet.size());
        System.out.println(treeSet);

    }
}
