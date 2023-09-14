package com.skl.day08;

public class UserTest {
}
class User{
    String name;
    int age;
    boolean isMale;
    public void talk(String language){
        System.out.println("我们使用，"+language+"交流。");
    }
    public void eat(){
        String food = "饼";
        System.out.println("北方人喜欢吃："+food);
    }
}