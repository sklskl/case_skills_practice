package com.skl.day10;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal =new Animal();
        animal.name = "tuantuan";
        animal.age = 1;
        animal.legs = 4;
        animal.show();

    }

}

class  Animal{
    String name;
    int age;
    int legs;
    public void setLegs(int l){
        if (l>=0 && l%2==0){
            l=1;
        }
        else l=-1;
    }
    public void eat(){
        System.out.println("动物进食");
    }
    public void show() {
        System.out.println("name:"+name+",legs:"+legs +",age:" +age);
    }
}