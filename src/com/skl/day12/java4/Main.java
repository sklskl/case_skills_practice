package com.skl.day12.java4;

public class Main extends Person {
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("赚钱养家");
    }

    @Override
    public void eat() {
        System.out.println("大男人，多吃肉");
    }

    @Override
    public void walk() {
        System.out.println("多走路");
    }
}
