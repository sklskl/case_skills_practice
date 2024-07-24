package com.test12;

import java.io.File;
import java.io.IOException;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-18 16:50
 */
public class Test01   {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/skl/Desktop/2023工作总结.docx");
        System.out.println(file.canRead());
        File file1 =new File("demoskl.doxc");
        if(file1.exists()){
            file1.createNewFile();
        }
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
    }
}
