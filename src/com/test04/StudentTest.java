package com.test04;

/**
 * @program: case_skills_practice
 * @ClassName: StudentTest
 * @author: skl
 * @create: 2024-05-28 15:37
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] student = new Student[20];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].score=(int)(Math.random()*100);
            student[i].number=i+1;
            student[i].state=(int)(Math.random()*6+1);
        }
    }
}
