package com.test12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @program: case_skills_practice
 * @ClassName: Test09
 * @author: skl
 * @create: 2024-03-26 14:22
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        //将内存中的字符串写出到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/skl/2021-skl/demo1.txt"));
        oos.writeObject("你好sklkk");

        oos.close();
    }
}
