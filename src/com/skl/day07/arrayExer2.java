package com.skl.day07;

public class arrayExer2 {
    public static void main(String[] args) {
        int [] arr1 = new int[]{2,3,5,7,11,13,17,19};
        int [] arr2 =new int[arr1.length] ;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();

        System.out.println("---------------");
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i]=arr1[i];
//            System.out.print(arr1[i]+"\t");
//
////            System.out.print("\n"+arr2[i]+"\t");
//        }
//        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if(i%2==0){
                arr2[i]=i;
            }else arr2[i]=arr1[i];
            System.out.print(arr1[i]+"\t");
        }
    }
}
