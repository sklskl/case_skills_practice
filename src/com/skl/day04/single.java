package com.skl.day04;

public class single {
    public static void main(String[] args) {
        int size = 5;
        int startNum = size / 2 + 1;//起始列行
        int endNum = size / 2 + 1;//结束列行
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j >= startNum && j <= endNum) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
            startNum--;
            endNum++;
        }

    }
}
