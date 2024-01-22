package com.skl.day05;

import java.util.Scanner;

/*心里想一个数
你猜
*
* */
public class TestMethod02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请你猜一个数：");
        int yourNum = sc.nextInt();
        myGuessNum(yourNum);
    }
    public static void myGuessNum(int yourNum){

        int myNum= (int)(Math.random()*100+1);
        System.out.println(yourNum==myNum?"猜对了":"猜错了");
    }
}
