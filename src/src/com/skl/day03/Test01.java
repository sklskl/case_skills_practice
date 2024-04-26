package src.com.skl.day03;

public class Test01 {
    public static void main(String[] args) {
        String str = "abcefghijk";
        System.out.println(str.substring(2,5));

        System.out.println(str.concat("pppp"));
        String str1 = "aaabbbccc";
        System.out.println(str1.replace('a','u'));
    }
}
