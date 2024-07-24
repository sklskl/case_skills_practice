package src.com.skl.day11;

/**
 * @program: case_skills_practice
 * @ClassName: StringTest
 * @author: skl
 * @create: 2024-07-15 16:28
 */
public class StringTest {
    String str = "good";
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
        System.out.println(reverse("abcdfr"));
        System.out.println(count("abcdfdcdrcd", "cd"));
    }

    //字符串反转
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        char temp;
        while (start < end) {
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    //获取一个字符串在另一个字符串出现的次数
    public static int count(String str, String s1) {
        char[] chars = str.toCharArray();
        char[] chars1 = s1.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (s1.length() > str.length()) return -1;
            if (chars[i] == chars1[0]) {
                boolean flag = true;
                for (int j = 0; j < chars1.length; j++) {
                    if (chars[i + j] != chars1[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        return count;
    }


}
