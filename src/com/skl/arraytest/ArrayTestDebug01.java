package com.skl.arraytest;

import java.util.Arrays;

public class ArrayTestDebug01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int [] arr = new int[5];
        arr[0] = 11;
        arr[2] = 22;
        arr[3] = 33;
        arr[4] = 44;
        Arrays.toString(arr);
        int eat = eat();
        System.out.println(eat);
    }
    public static int eat(){
        System.out.println("------->1");
        System.out.println("------->2");
        System.out.println("------->3");
        System.out.println("------->4");
        return 2;
    }
}
