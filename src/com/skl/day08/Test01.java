package com.skl.day08;

public class Test01 {
    /*
    * 代码块的分类：
      普通块
      构造块
      静态块
      同步块
      * */
    int a;
    static int sa;
    public void a(){
        {//普通块：限制局部变量的作用范围
            int num=10;
            System.out.println("-----普通块-----"+num);
        }
        System.out.println("-----a");
    }
    public static void b(){
        System.out.println("-----b");
    }
    //构造块
    public Test01(int a){
        this.a = a;
    }
    public Test01(){

    }
    //代码块
    {
        //构造块
        System.out.println("-----构造块-----");
    }
    static{
        //静态块

    }
}
