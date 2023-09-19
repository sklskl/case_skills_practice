package com.skl.day09;

public class RecursionTest {
    //计算1-100所有自然数的和
    public static void main(String[] args) {
//        for (int i = 0; i <101 ; i++) {
//
//        }
        RecursionTest recursionTest = new RecursionTest();
        int get_sum = recursionTest.getsum(10);
        System.out.println(get_sum);
    }
    public int getsum(int n){
        if (n==1) return 1;
        else return n+getsum(n-1);

    }
    public int getsum_sum(int n){
        return  0;

    }
}
