package com.skl.day06;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //1、使用scnner，读取学生个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num = sc.nextInt();


        //2、创建数组，存储学生成绩，动态初始化
        int[] scores = new int[num];

        //3、给数组中元素赋值
        System.out.println("请输入"+num+"个学生成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        //4、获取数组中的元素最大值：最高分
        int maxscore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxscore<scores[i]){
                maxscore=scores[i];
            }
        }

        char level;
        //5、根据每个学生成绩与最高分的差值，得到每个学生的登记，并输出等级和成绩
        for (int i = 0; i < scores.length; i++) {


            if (maxscore-scores[i]<=10){
                level='A';
            }
            else if (maxscore-scores[i]<=20){
                level='B';
            }
            else if (maxscore-scores[i]<=30){
                level='C';
            }
            else{
                level='D';
            }
            System.out.println("student "+i+"score is :"+scores[i]+
                    "level is:"+level);
        }
    }
}
