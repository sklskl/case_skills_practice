package com.test12;

import java.io.*;

/**
 * @program: case_skills_practice
 * @ClassName: Test05
 * @author: skl
 * @create: 2024-03-21 11:15
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/skl/Documents/skl笔记/skl图片/beimian.jpeg");
        File f2 = new File("/Users/skl/Documents/skl笔记/skl图片/beimian2.jpeg");
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        int n = fis.read();
        while (n!=-1){
            fos.write(n);
            n=fis.read();
        }
        fos.close();
        fis.close();

    }
}
