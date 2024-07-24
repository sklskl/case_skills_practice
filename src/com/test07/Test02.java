package com.test07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @program: case_skills_practice
 * @ClassName: Test02
 * @author: skl
 * @create: 2024-03-07 10:32
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        //增加一个字符串
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String str = it.next();
            if ("ccc".equals(str)){
                it.add("kkk");
            }
        }
        it.hasPrevious();
        System.out.println(list);
    }

}
