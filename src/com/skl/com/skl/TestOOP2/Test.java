package com.skl.com.skl.TestOOP2;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy(18,"aaa");
        Girl girl = new Girl("bbb",50);
        girl.love(boy);

        girl.m=new Mom();
        girl.wechat();
    }

}
