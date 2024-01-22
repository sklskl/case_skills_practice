package com.skl.day13.pack;

import org.junit.Test;

/*
*
* */
public class WrapperTest {
    //基本数据类型---》包装类：调用包装类的构造器
    @Test
    public void test1(){
        int num =10;
        Integer in1 = new Integer(num);
        System.out.println(in1.toString());
        Integer in2 = new Integer("222");
        System.out.println(in2.toString());
    }
    @Test
    public void test3(){
        String str1 = "123";
        
    }
}
