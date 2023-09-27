package com.skl.day12.java4;

public class Women extends Person {
     boolean isBeauty;

     public void shopping(){
         System.out.println("花钱购物");
     }

    @Override
    public void eat() {
        System.out.println("女生喜欢吃美食");
    }

    @Override
    public void walk() {
        System.out.println("多运动，减肥。");
    }
}
