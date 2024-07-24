package com.test02;

/**
 * @program: case_skills_practice
 * @ClassName: Test
 * @author: skl
 * @create: 2024-02-29 16:42
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Class c1 = person.getClass();
        System.out.println(c1);
        Class c2 = Person.class;
        System.out.println(c2 );
    }
}
