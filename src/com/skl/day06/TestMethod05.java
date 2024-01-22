package com.skl.day06;

import java.util.Arrays;

public class TestMethod05 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 45, 67, 7, 44, 10};
//        for (int i = 0; i < arr.length; i++) {
//            if (i != arr.length - 1) {
//                System.out.print(arr[i] + ",");
//            } else {
//                System.out.println(arr[i]);
//            }
//        }
        System.out.println("删除元素前的数组：" + Arrays.toString(arr));
        System.out.println();
        //删除元素
        int index = 2;
        if (index == -1) {
            System.out.println("fales");
        } else {
            for (int i = index; i <= arr.length - 2; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.println("删除元素后的数组：" + Arrays.toString(arr));

        }
    }
}
