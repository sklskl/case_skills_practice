package com.skl.day05;

public class Meeting {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println("交换前,a="+a+";b="+b);
        changeNum(a,b);
        System.out.println("交换后,a="+a+";b="+b);
    }
    public static void changeNum(int num1,int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
//        System.out.println("交换后,num1="+num1+"="+b);
    }
}
