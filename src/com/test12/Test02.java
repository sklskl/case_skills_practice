package com.test12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: case_skills_practice
 * @ClassName: Test02
 * @author: skl
 * @create: 2024-03-19 15:22
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/skl/2021-skl/demo.txt");
        FileReader fr = new FileReader(file);

        char[] ch  =new char[5];
        int len = fr.read(ch);
        while (len!=-1){
            for (int i = 0; i < len; i++) {
                System.out.print(ch[i]);

            }
            len = fr.read(ch);
        }


        fr.close();
    }
}
