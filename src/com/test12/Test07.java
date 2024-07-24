package com.test12;

import java.io.*;

/**
 * @program: case_skills_practice
 * @ClassName: Test07
 * @author: skl
 * @create: 2024-03-22 16:29
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/skl/2021-skl/demo.txt");
        File f2 = new File("/Users/skl/2021-skl/demo1.txt");
        //输入方向
        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //输出方向
        FileOutputStream fos = new FileOutputStream(f2);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

    }
}
