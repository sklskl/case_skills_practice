package src.com.skl.day02;

/**
 * @program: case_skills_practice
 * @ClassName: ValueTransferTest
 * @author: skl
 * @create: 2024-05-28 21:43
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //基本数据类型的局部变量
        int m = 10;
        int n = m;
        System.out.println("m" + m + ",n" + n);
        m++;
        System.out.println("m" + m + ",n" + n);
        //引用数据类型的局部变量
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = arr1;
        arr2[0] = 10;
        System.out.println(arr2[0]);
        System.out.println(arr1[0]);
        Order order =new Order();
        order.orderid=10;
    }

    public void m1(int m) {
    }
}
class  Order{
    int orderid;
}