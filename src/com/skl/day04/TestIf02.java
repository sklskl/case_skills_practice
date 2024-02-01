package com.skl.day04;


import java.util.Scanner;

public class TestIf02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入小朋友年龄：");
        int age = sc.nextInt();
        if (age >=7){
            System.out.println("可以搬得动桌椅");
        }else if (age >=5){
            System.out.print("请输入小朋友性别：");
            int sex = sc.nextInt();//man 1;woman 0
            if(sex ==1){
                System.out.println(age+"岁的男生可以搬得动桌椅");
            }else {
                System.out.println("no");
            }
        }
    }
}
