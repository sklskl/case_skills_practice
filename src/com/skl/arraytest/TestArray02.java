package com.skl.arraytest;

import java.util.Scanner;

/*数组用来存储相同数据类型的数据
1、声明：
int []arr;//定义一个int类型的数据，名字叫arr
2、创建
arr = new int[4]

声明和创建可以和在一起  int[] arr = new int[4]
4、赋值
arr[0]=4;
* */
public class TestArray02 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int [] scores = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            scores[i] = sc.nextInt();
            sum+=scores[i];
        }
        System.out.println("总成绩为"+sum);
    }
}
