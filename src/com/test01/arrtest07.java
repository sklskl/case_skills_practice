package com.test01;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest07
 * @author: skl
 * @create: 2024-04-25 09:47
 */
public class arrtest07 {
    //长度为6的整数数组，1-30之间的随机数，且不相等
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            int num = (int) (Math.random() * 30) + 1;
            for (int j = 0; j <= i; j++) {
                if (num == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[i] = num;
            } else {
                i--;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}


