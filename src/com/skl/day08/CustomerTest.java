package com.skl.day08;

public class CustomerTest {
}

class Customer {
    String name;
    int age;
    boolean isMale;
    public void eat(){
        System.out.println("客户在吃饭");
    }
    public void sleep(int hour){
        System.out.println("客户休息了"+hour+"小时。");
    }
    public String getName(){
        return name;
    }
    public String  nation(String nation){
        String info = "我的国籍："+nation;
        return info;
    }
}