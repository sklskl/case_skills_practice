package com.skl.day04;

import java.util.Scanner;

/*
* 录入10个数，当录入到666退出程序
* 判断正数的个数
* 判断是正常退出还是被迫退出
*
* */
public class break04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zhengshu = 0;
        int tuichu = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("请录入第" + i + "个数: ");
            int num = sc.nextInt();
            tuichu++;
            if (num > 0) zhengshu++;
            if (num == 666) break;

        }
        if (tuichu == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("正数有：" + zhengshu + "个。");
    }

}
