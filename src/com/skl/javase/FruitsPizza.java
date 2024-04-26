package com.skl.javase;

public class FruitsPizza extends Pizza{
    private String burdening;//配料

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    public FruitsPizza() {
    }


    public FruitsPizza(String name, int size, int price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }
    public String showPizza() {
        return super.showPizza()+"\n配料水果："+burdening;
    }

}
