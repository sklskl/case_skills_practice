package com.test05;

import java.util.*;

/**
 * @program: case_skills_practice
 * @ClassName: Test
 * @author: skl
 * @create: 2024-03-05 15:32
 */
public class Test {
    public static void main(String[] args) {
        List<Object> a =new ArrayList<>();
        List<Person> b =new ArrayList<>();
        List<Student> c =new ArrayList<>();
        List <? extends Person> p = null;
//        p=a;
        p=c;
        p=b;
    }
}
