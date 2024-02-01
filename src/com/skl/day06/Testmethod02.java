package com.skl.day06;

import sun.text.resources.in.FormatData_in;

public class Testmethod02 {
    public static void main(String[] args) {
        int [] arrs = {12,4,78,39,9};
        int maxNum = arrs[0];
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i]>maxNum){
                maxNum = arrs[i];
            }
        }
        System.out.println("maxNum:"+maxNum);
    }
}
