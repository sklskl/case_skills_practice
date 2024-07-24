package com.test12;

import java.io.*;

/**
 * @program: case_skills_practice
 * @ClassName: Test03
 * @author: skl
 * @create: 2024-03-20 15:47
 */
public class Test04 {
    //字符流实现文件复制
    public static void main(String[] args)  {
        File f1 = new File("/Users/skl/Documents/skl笔记/skl图片/beimian.jpeg");

        File f2 = new File("/Users/skl/2021-skl/demo.txt");
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);

            char[] ch = new char[5];
            int len = fr.read(ch);
            while (len != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(ch[i]);

                }
                len = fr.read(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fr.close();
            } catch (IOException e) {

            }
        }





    }
}
