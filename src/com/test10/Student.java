package com.test10;

import java.util.Comparator;

/**
 * @program: case_skills_practice
 * @ClassName: Student
 * @author: skl
 * @create: 2024-03-07 16:41
 */
public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
class Bijiao implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}