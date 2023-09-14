package com.skl.day07;

public class arrayExer {
    public static void main(String[] args) {
        int [] array =new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(99-10+1)+10);
        }
        //遍历
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        //max
        int maxarray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxarray){
                maxarray =array[i];
            }
        }
        System.out.println("maxarray:"+maxarray);
    }
}
