package com.test11;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * @program: case_skills_practice
 * @ClassName: Test02
 * @author: skl
 * @create: 2024-03-11 16:36
 */
public class Test02 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.put(4,"ddd");
        map.put(4,"ccc");
        map.put(6,"ddd");
        System.out.println(map);
        TreeSet t = new TreeSet(map.values());
    }
}
