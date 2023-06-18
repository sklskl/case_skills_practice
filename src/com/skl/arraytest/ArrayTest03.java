package com.skl.arraytest;
//指定位置增加元素:下标元素2的地址增加一个数9
public class ArrayTest03 {
    public static void main(String[] args) {
        int [] arr = {12,34,25,46,56,89};
        System.out.print("增加元素前的数组元素：");
        for (int i = 0; i < arr.length; i++) {
            if (i !=arr.length-1)
                System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]);
        }
        insertNums(arr, 2, 888);
        //增加元素
//        for (int i = arr.length-1; i >=(index+1) ; i--) {
//            arr[i]=arr[i-1];
//        }
//        arr[index]=9;


        System.out.print("\n增加元素后的数组元素：");
        for (int i = 0; i < arr.length; i++) {
            if (i !=arr.length-1)
                System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]);
        }

    }

    public static void insertNums(int[] arrs, int index, int ele){
        for (int i = arrs.length-1; i >= (index+1); i--) {
            arrs[i]=arrs[i-1];
        }
        arrs[index] = ele ;

    }
}
