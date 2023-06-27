package com.skl.arraytest;

import java.util.Arrays;

public class ArrayTest08 {
    public static void main(String[] args) {
        int [] srcarr = {1,4,6,8,9,10,39,59};
        int [] destarr = new int[10];
        System.arraycopy(srcarr, 1,destarr,3,3);
        System.out.println(Arrays.toString(destarr));
    }
}
