package com.skl.javase;

public class BaconPizza extends Pizza{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public BaconPizza() {
    }

    public BaconPizza(String name, int size, int price, double height) {
        super(name, size, price);
        this.height = height;
    }
    public String showPizza(){
        return super.showPizza()+"\n培根的克数："+height;
    }

}
