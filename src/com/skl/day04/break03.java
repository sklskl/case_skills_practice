package com.skl.day04;

public class break03 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
                sum+=1;
                if (sum%6==0){
                    System.out.println();
                }
            }

        }

    }
}
