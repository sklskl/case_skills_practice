package com.skl.day04;


import java.util.Scanner;

public class jifen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的积分：");
        if (scanner.hasNextInt() ==true) {
            int num = scanner.nextInt();

            if (num > 8000) {
                System.out.println("6折优惠");
            } else if (num >= 6000 && num < 8000) {
                System.out.println("7折");
            } else if (num >= 4000 && num < 6000) {
                System.out.println("8折");
            } else {
                System.out.println("9折");
            }
        }
    }
}
