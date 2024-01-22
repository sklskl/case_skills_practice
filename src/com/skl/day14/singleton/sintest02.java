package com.skl.day14.singleton;

public class sintest02 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1==order2);
    }

}

//懒汉式
class Order{
    //1私有化构造器

    private Order() {
    }

    //2内部创建类的对象，不初始化
    private static Order instance = null;

    //3提供公共静态的方法，返回类的对象
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}