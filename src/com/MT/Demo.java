package com.MT;

import java.lang.reflect.Method;

/**
 * @program: case_skills_practice
 * @ClassName: Demo
 * @author: skl
 * @create: 2024-02-29 10:53
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String str = "com.MT.Alipay";
        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("payonline");
        method.invoke(o);
    }
}
