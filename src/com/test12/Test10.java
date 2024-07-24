package com.test12;

import java.io.*;

/**
 * @program: case_skills_practice
 * @ClassName: Test10
 * @author: skl
 * @create: 2024-03-26 14:42
 */
public class Test10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/skl/2021-skl/demo1.txt"));

       String s = (String)(ois.readObject());
        System.out.println(s);
       ois.close();

    }
}
