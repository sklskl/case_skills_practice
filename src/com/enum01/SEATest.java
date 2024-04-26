package com.enum01;

public class SEATest {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println("---------");
        Season[] season1 = Season.values();
        for (Season s :season1) {
            System.out.println(s);
        }
    }
}
