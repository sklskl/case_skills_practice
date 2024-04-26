package com.test11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @program: case_skills_practice
 * @ClassName: Test03
 * @author: skl
 * @create: 2024-03-13 09:44
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        Collections.addAll(list,"ee","ff","gg");
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, "ff"));
    }
}
