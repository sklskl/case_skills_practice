package com.skl.javase;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你想要购买的披萨(1、培根披萨  2、水果披萨) ：");
        int choice = sc.nextInt();
        //通过工厂获取披萨
        Pizza pizza = PizzaStroe.getPizza(choice);
        System.out.println(pizza.showPizza());
    }

}

