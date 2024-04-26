package com.skl.test01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入两个数，求商
        Scanner sc = new Scanner(System.in);
        System.out.println("请从键盘录入第一个数：");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            System.out.println("请从键盘录入第二个数：");
            int num2 = sc.nextInt();
            if (num2 == 0) {
                System.out.println("除数不能为零 ");
            } else {
                System.out.println("商：" + num1 / num2);
            }
        } else {
            System.out.println("录入的不是整数");
        }
    }
}
