package src.com.skl.day02;

/**
 * @program: case_skills_practice
 * @ClassName: Fibo
 * @author: skl
 * @create: 2024-05-29 21:36
 */
public class Fibo {
    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        System.out.println(fibo.fibo(10));
    }
    public int fibo(int n){
        if (n==1){
            return 1;
        } else if (n==2) {
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2) ;
        }
    }
}
