package src.com.skl.day02;

/**
 * @program: case_skills_practice
 * @ClassName: ValueTransTest01
 * @author: skl
 * @create: 2024-05-28 22:14
 */
public class ValueTransTest01 {
    public static void main(String[] args) {
        int m =10;
        int n=20;
        System.out.println("m:"+m+",n:"+n);
        int temp;
        temp=m;
        m=n;
        n=temp;
        System.out.println("m:"+m+",n:"+n);

//        ValueTransTest01 valueTransferTest = new ValueTransTest01();
//        valueTransferTest.m1(m);
//        System.out.println(m);

    }
//    public void m1(int m){
//        m++;
//    }
}
