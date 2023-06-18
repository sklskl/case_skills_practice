package com.skl.arraytest;

public class TestArray {
    //求最值
    public static int maxNum(int [] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] arr = {20,4,19,50,8};
        int maxNum = maxNum(arr);
        System.out.println("max:"+maxNum);
    }
}
