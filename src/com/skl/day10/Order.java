package com.skl.day10;

public class Order {
    private int orderPrivate;
    int orderDefult;
    public int orderPublic;
    private void methodPrivate(){
        orderPrivate = 1;
        orderDefult = 2;
        orderPrivate = 3;
    }
    void methodDefult(){
        orderPrivate = 1;
        orderDefult = 2;
        orderPrivate = 3;
    }
    public void methodPublic(){
        orderPrivate = 1;
        orderDefult = 2;
        orderPrivate = 3;
    }

}
