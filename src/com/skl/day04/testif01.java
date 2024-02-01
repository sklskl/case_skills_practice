package com.skl.day04;

import java.util.Random;

/*随机给出三个数
*
* */
public class testif01 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i < 3; i++) {
            int d = (int)(Math.random()*6)+1;
            System.out.println(d);
            sum +=d;
        }
        System.out.println(sum);
    }
}
