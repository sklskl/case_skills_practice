package com.skl.chapter03;

public class javakongzhi3_2 {
    public static void main(String[] args) {
//        System.out.println(test(1));
        double r = 0;
        while (r < 0.99d){
            r = Math.random();
            System.out.println(r);
        }

    }
    public static int test(int testinvel){
        int result = 0;
        if(testinvel > result)
            result = -1;
        else if (testinvel < result)
            result=+1;
        else
            result=0;
        return result;
    }
}
