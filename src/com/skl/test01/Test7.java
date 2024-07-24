package com.skl.test01;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //两个数相除


    }

    public static void devide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请从键盘录入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请从键盘录入第二个数：");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("商：" + num1 / num2);
        }
    }
}
