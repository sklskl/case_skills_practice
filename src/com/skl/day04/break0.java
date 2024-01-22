package com.skl.day04;
/*
* 1-100的和，当第一次超300的时候停止程序
* */
public class break0 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i <=100; i++) {
            sum += i;
            if (sum > 300) {
                break;
            }
            System.out.println("sum:" + sum);
        }
    }
}
