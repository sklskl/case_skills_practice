package com.test01;

import org.junit.Assert;
import org.junit.Test;
import src.com.skl.day03.Test04;

public class CalculTest {
    //测试加法
    @Test
    public void testADD(){
        Test04 t = new Test04();
        int add =t.add(10,20);
        System.out.println(add );
        Assert.assertEquals(30,add);
    }
    //测试减法
    public void testsub(){

    }
}
