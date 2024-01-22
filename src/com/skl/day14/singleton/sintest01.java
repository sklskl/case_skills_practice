package com.skl.day14.singleton;

public class sintest01 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
    }

}
//饿汉式
class Bank{
    //1私有化构造器

    private Bank() {
    }
    //2内部创建类的对象
    private static Bank instance = new Bank();
    //3提供公共静态的方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}