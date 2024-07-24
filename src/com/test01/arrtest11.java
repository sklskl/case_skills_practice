package com.test01;

import java.util.Arrays;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest11
 * @author: skl
 * @create: 2024-04-28 15:23
 */
public class arrtest11 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int[] arr2 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
//        System.out.println(arr.equals(arr2) );
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr);
//        Arrays.fill(arr,10);
         System.out.println(Arrays.toString(arr));;
//        System.out.println(Arrays.sort(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            
        }
    }

}
