package com.test06;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-05 15:56
 */
public class Test01 {
    public static void main(String[] args) {

        //增加 add
        //删除 clear poll删除头元素并输出
        //修改
        //查看 getfirt getlast  lastindex last
        //判断
        LinkedList <String> list = new LinkedList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("eeee");
        list.add("ffff");
        list.add("dddd");
        System.out.println(list);
        list.offerFirst("zzzz");
        list.offerLast("hhhh");
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
        list.iterator();
    }
}
