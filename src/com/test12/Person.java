package com.test12;

import java.io.Serializable;

/**
 * @program: case_skills_practice
 * @ClassName: Person
 * @author: skl
 * @create: 2024-03-26 16:59
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L; //序列化版本号
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
