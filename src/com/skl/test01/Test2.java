package com.skl.test01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请从键盘录入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请从键盘录入第二个数：");
            int num2 = sc.nextInt();
            System.out.println("商：" + num1 / num2);
        } catch (Exception e) {
            System.out.println("程序出现异常");
            e.printStackTrace();//打印异常堆栈信息
        }finally {
            System.out.println("thanks your");
        }

    }
}
