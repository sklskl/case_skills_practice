package com.skl.day06;


public class TestMethod04 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 45, 67, 7, 44, 10};
        System.out.println("增加元素前的数组：");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
        //增加元素
//        int index = 1;
//        for (int i = arr.length-1; i >=(index+1); i--) {
//            arr[i]=arr[i-1];
//        }
//        arr[index]=666;
        insertElem(arr,2,333);


        System.out.println("增加元素后的数组：");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
    public static void insertElem(int [] arr, int index,int element){
        for (int i = arr.length-1; i >=(index+1); i--) {
            arr[i]=arr[i-1];
        }arr[index]=element;
    }
}
