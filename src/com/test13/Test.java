package com.test13;

/**
 * @program: case_skills_practice
 * @ClassName: Test
 * @author: skl
 * @create: 2024-04-02 14:45
 */
public class Test {
    public static void main(String[] args) {
       int[] arr = new int[]{8,2,1,0,3};
       int [] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
       String tel ="";
        for (int i = 0; i < index.length; i++) {
            int val = index[i];
            tel+=arr[val];

        }
        System.out.println("联系方式："+tel);
    }
}
