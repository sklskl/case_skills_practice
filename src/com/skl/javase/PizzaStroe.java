package com.skl.javase;

import java.util.Scanner;

public class PizzaStroe {
    public static Pizza getPizza(int choice) {
        Scanner sc = new Scanner(System.in);

        Pizza p = null;
        switch (choice) {
            case 1: {
                System.out.print("请输入培根的克数：");
                int weight = sc.nextInt();
                System.out.print("请输入培根的大小：");
                int size = sc.nextInt();
                System.out.print("请输入培根价格：");
                int price = sc.nextInt();
                //将录入的信息封装为对象
                BaconPizza bp = new BaconPizza("培根披萨", size, price, weight);
                p=bp;
            }
            break;
            case 2: {
                System.out.print("请输入你想要加入的水果：");
                String burdening = sc.next();
                System.out.print("请输入披萨的大小：");
                int size = sc.nextInt();
                System.out.print("请输入披萨的价格：");
                int price = sc.nextInt();
                FruitsPizza fp = new FruitsPizza("水果披萨", size, price, burdening);
                p=fp;

            }
            break;
        }
        return p;
    }
}
