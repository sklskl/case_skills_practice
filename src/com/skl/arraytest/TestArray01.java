package com.skl.arraytest;

import java.util.Scanner;

public class TestArray01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入第"+(i+1)+"个学生成绩：");
            int score = sc.nextInt();
            sum += score;

        }
        System.out.println("10个学生的成绩总分："+sum);

    }

}
