package com.skl.day08;

public class StudentTest {
    public static void main(String[] args) {
        Student1[] s = new Student1[20];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student1();
            s[i].number = i+1;
            s[i].state = (int)(Math.random()*(6-1+1)+1);
            s[i].score = (int)(Math.random()*(100-0+1));
        }
        //遍历
        for (int i = 0; i < s.length; i++) {
//            System.out.print(s[i].number+"\t");
//            System.out.print(s[i].score+"\t");
//            System.out.println(s[i].state);
            System.out.println(s[i].info());
        }
        System.out.println("--------------");

        //打印三年级学生成绩
        for (int i = 0; i < s.length ; i++) {
            if (s[i].state ==3){
                System.out.println(s[i].info());
            }
        }
        //冒泡
        for (int i = 0; i < s.length-1; i++) {
            for (int j = 0;j<s.length-1-i;j++)
            if (s[j].score >s[j+1].score ){
                Student1 temp = s[j];
                s[j] = s[j+1];
                s[j+1] = temp;
            }

        }
        System.out.println("***********");
        for (int i = 0; i < s.length ; i++) {

                System.out.println(s[i].info());

        }

    }
}
class Student1 {
    int number;//学号
    int score;//成绩
    int state;//年纪
    //显示学生信息的方法
    public String info(){
        return "学号："+number+"，成绩："+score+"，年纪："+state;
    }
}