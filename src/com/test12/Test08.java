package com.test12;

import java.io.*;

/**
 * @program: case_skills_practice
 * @ClassName: Test08
 * @author: skl
 * @create: 2024-03-25 15:39
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        File f2 = new File("/Users/skl/2021-skl/demo1.txt");
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);
        String s = br.readLine();
        while (!s.equals("exit")){
            bw.write(s);
            s=br.readLine();
        }

    }
}
