package com.test12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: case_skills_practice
 * @ClassName: Test03
 * @author: skl
 * @create: 2024-03-20 15:47
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/skl/2021-skl/demo01.txt");
        FileWriter fw = new FileWriter(f);
        String str = "hello world 你好";
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        fw.close();

    }
}
