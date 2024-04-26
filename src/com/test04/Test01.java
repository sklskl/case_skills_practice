package com.test04;

import java.util.ArrayList;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-04 16:42
 */
public class Test01 {
    public static void main(String[] args) {
        /*创建一个ArrayList集合，向这个集合中存入学生成绩，*/
        ArrayList al = new ArrayList();
        al.add(89);
        al.add(87);
        al.add(90);
        al.add(94);
        al.add(79);
        al.add("skl");
        System.out.println(al);
        for (Object o : al) {
            System.out.println(o);
        }
    }
}
