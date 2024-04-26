package com.test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: case_skills_practice
 * @ClassName: Test02
 * @author: skl
 * @create: 2024-03-04 11:06
 */
public class Test02 {
    public static void main(String[] args) {
        Collection col1 = new ArrayList();
        col1.add(12);
        col1.add(13);
        col1.add(14);
        col1.add(15);
        for(Object o:col1){
            System.out.println(o);
        }
        Iterator it = col1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
