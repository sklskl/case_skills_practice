package com.skl.day15.abstractTest;

public class MyData {
    private int year;
    private int month;
    private int day;
    public String toDataString(){
        return year+"年 "+month+"月 "+day+"日";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

