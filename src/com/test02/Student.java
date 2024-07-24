package com.test02;

/**
 * @program: case_skills_practice
 * @ClassName: Student
 * @author: skl
 * @create: 2024-02-29 15:47
 */
public class Student extends Person {
    //属性
    private int sno;//学号
    double height;//身高
    protected double weight;//tizhong
    public double score;//成绩


    //方法
    public String showInfo() {
        return "我是一名三好学生";
    }

    public void work() {
        System.out.println("努力打工赚钱");
    }
    //构造器
    public Student() {
        System.out.println("空参构造器");
    }

    public Student(int sno) {
        this.sno = sno;
    }

    public Student(int sno, double height, double weight, double score) {
        this.sno = sno;
        this.height = height;
        this.weight = weight;
        this.score = score;
    }
}
