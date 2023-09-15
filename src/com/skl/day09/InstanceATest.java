package com.skl.day09;

public class InstanceATest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.sendEmail();
        p.playGame();

    }
}
class Phone{
    double price;
    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){
        System.out.println("玩游戏。");
    }
}