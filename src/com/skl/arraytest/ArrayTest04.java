package com.skl.arraytest;
//删除某元素
public class ArrayTest04 {
    public static void main(String[] args) {
        int [] arrs = {20,45,29,69,49,28};
        System.out.println("删除前：");
        for (int i = 0; i < arrs.length; i++) {
            if (i !=arrs.length-1)
                System.out.print(arrs[i]+",");
            else
                System.out.print(arrs[i]);
        }
        delNum(arrs,2);
        System.out.println("\n删除后：");
        for (int i = 0; i < arrs.length; i++) {
            if (i !=arrs.length-1)
                System.out.print(arrs[i]+",");
            else
                System.out.print(arrs[i]);
        }

    }
    public static void delNum(int[] arrs, int index){
        for (int i = index+1; i <= arrs.length-1; i++) {
            arrs[i-1] = arrs[i];
        }
        arrs[arrs.length-1]=0;
    }
}
