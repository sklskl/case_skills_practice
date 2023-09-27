package com.skl.day10;

public class GirlBoyTest {
    public static void main(String[] args) {
        Boy boy = new Boy("sss", 12);
        boy.shout();
        Girl girl = new Girl("kkk", 20);
        girl.marry(boy);
        Girl girl1 = new Girl("kkk", 30);
        int com = girl.compare(girl1);
        System.out.println(com);

    }
}
