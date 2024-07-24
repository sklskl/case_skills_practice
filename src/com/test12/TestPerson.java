package com.test12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @program: case_skills_practice
 * @ClassName: TestPerson
 * @author: skl
 * @create: 2024-03-27 09:34
 */
public class TestPerson {
    public static void main(String[] args) throws IOException {
        //序列化，将内存中的对象写到文件中
        Person p = new Person("skl", 18);
        //对象流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/skl/2021-skl/demo4.txt"));
        oos.writeObject(p);
        oos.close();
    }
}
