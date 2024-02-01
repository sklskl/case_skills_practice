package com.skl.day07;

import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int[] arr = new int[4];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        Arrays.toString(arr);
//        System.out.println(Arrays.toString(arr));
        int d = eat();
        System.out.println(d);
    }

    private static final int AGE = 100;
    public static final int NAME = 111;

    public static int eat() {
        System.out.println("----1----");
        System.out.println("----2----");
        System.out.println("----3----");
        System.out.println("----4----");
        return 5;
    }
}
