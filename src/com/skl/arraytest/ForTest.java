package com.skl.arraytest;

public class ForTest {
    public static void main(String[] args) {
        int index = 3;
        int[] arr = {1,4,7,8,10,30,49,58};
        for (int i = arr.length-1; i > index; i--) {
            System.out.println(arr[i]);
        }
    }
}
