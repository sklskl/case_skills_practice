package com.skl.arraytest;

import java.util.Scanner;

public class override {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入第"+(i+1)+"名学生的成绩：");
            int score = sc.nextInt();
            sum += score;

        }
        System.out.println("十个学生成绩之和为："+sum);
        System.out.println("十个学生成绩平均成绩为："+sum/10);

    }
//    public static int sum(int num1, int num2){
////        return num1+num2;
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            System.out.print("请输入第"+(i+1)+"名学生的成绩：");
//            int score = sc.nextInt();
//
//        }
//        return 0;
//    }
}

