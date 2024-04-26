package com.test01;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest04
 * @author: skl
 * @create: 2024-04-23 15:36
 */
public class arrtest04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //求最大 最小 总和
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int ave;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];


        }
        System.out.println("max" + max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        ave=sum/arr.length;
        System.out.println("min" + min);
        System.out.println("sum" + sum);
        System.out.println("ave" + ave);
    }
}
