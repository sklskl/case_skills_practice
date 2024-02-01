package com.skl.day13;
/*
* object 是所有Java类的父类
* */
public class objectTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());

    }
}
class Order{

}