package com.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: case_skills_practice
 * @ClassName: Test03
 * @author: skl
 * @create: 2024-03-04 14:02
 */
public class Test03 {
    /*
     * List
     * 增 add
     * 删   remove
     * 改set
     * 查 get
     * 判断
     * */
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(10);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        System.out.println(l1);
        l1.add(3,30);
        System.out.println(l1);
        l1.set(3,99);
        System.out.println(l1);
        l1.remove(1 );
        System.out.println(l1);
    }
}
