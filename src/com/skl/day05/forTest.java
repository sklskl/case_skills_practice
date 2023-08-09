package com.skl.day05;

import java.util.Scanner;

public class forTest {
    /**
     * 两个正整数的最大公约数和最小公倍数
     * 使用break关键字
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int m = sc.nextInt();
        System.out.println("请输入第二个正整数：");
        int n = sc.nextInt();
        //获取两个数中最大公约数
        int min = (m<n)?m:n;
        for (int i = min; i > 0; i--) {
            if (m % i == 0 && n % i == 0){
                System.out.println("最大公约数为："+i);
                break;
            }
        }
        //获取最小公倍数
        int max = (m>n)?m:n;
        for (int i = max; i <= m*n ; i++) {
            if (m % i == 0 && n % i == 0){
                System.out.println("最小公倍数为："+i);
                break;
            }
        }
    }
}
