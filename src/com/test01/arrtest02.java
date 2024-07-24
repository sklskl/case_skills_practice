package com.test01;

import java.util.Scanner;

import static java.util.Arrays.sort;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest02
 * @author: skl
 * @create: 2024-04-11 16:29
 */
public class arrtest02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int []arr = new int [count];
        System.out.println("请输入"+count+"个数");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
//        sort(arr);
        int MAX_NUM = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>MAX_NUM)
                MAX_NUM = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (MAX_NUM-arr[i]<=10) System.out.println("A");
            else if (MAX_NUM-arr[i]<=20) System.out.println("B");
            else if (MAX_NUM-arr[i]<=30) System.out.println("C");
            else System.out.println("D");
        }

    }
}
