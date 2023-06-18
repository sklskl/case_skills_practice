package com.skl.arraytest;


import java.util.Arrays;

//删除指定元素
public class ArrayTest06 {
    public static void main(String[] args) {
        //定义数组
        int [] arrs = {20,45,29,69,49,28};
        //删除前
        System.out.println("删除前：");
        System.out.println(Arrays.toString(arrs));
        delNum(arrs,3);
        System.out.println("\n删除后：");
        for (int i = 0; i < arrs.length; i++) {
            if (i !=arrs.length-1)
                System.out.print(arrs[i]+",");
            else
                System.out.print(arrs[i]);
        }

    }
    public static void delNum(int[] arrs, int index){
        index= -1;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == 49){
                index = i;
            }
        }

        if (index!=-1){
            for (int i = index+1; i <= arrs.length-1; i++) {
                arrs[i - 1] = arrs[i];
            }
            arrs[arrs.length-1]=0;
        }else {
            System.out.println("删除失败。");
        }

    }
}
