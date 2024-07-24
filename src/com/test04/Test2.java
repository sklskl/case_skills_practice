package com.test04;

/**
 * @program: case_skills_practice
 * @ClassName: Test2
 * @author: skl
 * @create: 2024-03-05 14:36
 */
public class Test2 <E>{
    public void e(E e){

    }
    //范型方法
    public <T> void b (T t){

    }
}
class  Demo{
    public static void main(String[] args) {
        Test2 <String> test2 = new Test2<>();
        test2.e("sb");
        test2.b(123);
    }
}