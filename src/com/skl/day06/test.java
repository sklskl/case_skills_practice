package com.skl.day06;

public class test {
    public static void main(String[] args) {

    }

    public static void tesst1() {
        label:
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j % 4 == 0) {
                    continue label;
                }
                System.out.println(j);

            }

        }
    }
}
