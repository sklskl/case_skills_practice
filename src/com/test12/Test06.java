package com.test12;

import java.io.*;

/**
 * @program: case_skills_practice
 * @ClassName: Test06
 * @author: skl
 * @create: 2024-03-22 10:59
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/skl/2021-skl/demo.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        char[] ch = new char[20];
        int len = isr.read(ch);
        while (len != -1) {
            //将缓冲数组转为字符串，打印到控制台
            System.out.println(new String(ch, 0, len));
            len = isr.read(ch);
        }
        isr.close();
    }

}
