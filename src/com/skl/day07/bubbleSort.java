package com.skl.day07;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{43,32, 75,56,25,98};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-1; j++) {
                if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }

                System.out.println(arr[j]);
            }
        }
    }
}
