package com.skl.javase;

public class Pizza {
    //属性
    private String name;//名称
     private int size;//大小
     private int price;//价格
    //方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //展示披萨信息
    public String showPizza(){
        return "披萨的名字："+name+"\n大小："+size+"\n价格："+price;
    }

    //构造器

    public Pizza() {
    }

    public Pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
}
