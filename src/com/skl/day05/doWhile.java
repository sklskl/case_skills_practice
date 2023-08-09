package com.skl.day05;
//遍历100以内的偶数
public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 ==0){
                System.out.println("偶数："+i);
            }
            i++;
        }while (i <100);
    }
}
