package com.skl.com.skl.TestOOP2;

public class Girl {
    //属性
    String name;
    double weight;
    Mom m;
//    Mom m = new Mom();

    //方法
    public void add(int a){
        System.out.println(a);
        System.out.println(a+100);
    }
    public void love(Boy boy) {
        boy.buy();
        System.out.println("男朋友的名字:"+boy.name+";男朋友的年龄："+boy.age);
    }

    public void wechat(){
        m.say();
    }
    //构造器


    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
