package com.test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-04 10:01
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        * collenction
        * 增 add
        * 删 clear  remove
        * 改
        * 查 iterator
        * 判断 contains  equals isempty
        *
        * */
        //接口不能直接创建对象，利用实现类创建对象
        //集合特点，只能存放应用数据类型的数据，不能存放基本数据类型的数据，但是基本数据类型可以自动装箱
        Collection  col = new ArrayList();
        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        System.out.println(col);
        List list = Arrays.asList(new Integer[]{12,45,78,90});
        col.add(list);
//        col.clear();
        System.out.println(col);
        System.out.println(col.size());
        System.out.println("是否为空"+col.isEmpty());
        System.out.println(col.remove(17));
        System.out.println(col);
        Collection col2 = new ArrayList();
        col2.add(12);
        col2.add(13);
        col2.add(14);
        col2.add(15);
        Collection col3 = new ArrayList();
        col3.add(12);
        col3.add(13);
        col3.add(14);
        col3.add(15);
        System.out.println(col2.equals(col3 ));
    }
}
