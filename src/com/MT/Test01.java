package com.MT;

import com.test02.Student;

import java.lang.reflect.Constructor;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-01 10:27
 */
public class Test01 {
    public static void main(String[] args) {
        Class cls1 =Student.class;
        Constructor[] c1 = cls1.getConstructors();
        for (Constructor c:c1) {
            System.out.println(c);
        }
    }
}
