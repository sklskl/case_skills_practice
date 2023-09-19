package com.skl.day09;

public class ValueTransferTest {
    public static void main(String[] args) {
        Data d = new Data();
        d.m=10;
        d.n=20;
        System.out.println("m="+d.m+",n="+d.n);
        ValueTransferTest v = new ValueTransferTest();
        v.swap(d);
        System.out.println("m="+d.m+",n="+d.n);
    }
    public void swap(Data d){
        int temp = d.m;
        d.m=d.n;
        d.n=temp;
    }
}
class Data {
    int m;
    int n;
}