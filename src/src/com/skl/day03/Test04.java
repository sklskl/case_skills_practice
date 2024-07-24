package src.com.skl.day03;

public class Test04 {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Test04 t4 = new Test04();
        int add = t4.add(10,5);
        System.out.println(add);
        int sub = t4.sub(10,5);
        System.out.println(sub);
    }
}
