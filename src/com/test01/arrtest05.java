package com.test01;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest05
 * @author: skl
 * @create: 2024-04-24 10:37
 */
public class arrtest05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i]+"\t");
        }
        //去掉一个最高，去掉一个最低分
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int ave;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
    }
}
