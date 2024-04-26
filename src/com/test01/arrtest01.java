package com.test01;

import java.util.Scanner;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest
 * @author: skl
 * @create: 2024-04-11 15:35
 */
public class arrtest01 {
    public static void main(String[] args) {
        String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入1-7之间的数字：");
        int day = sc.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("你输入的数据有误。");
        } else {
            System.out.println(weeks[day - 1]);
        }
        sc.close();
    }
}
