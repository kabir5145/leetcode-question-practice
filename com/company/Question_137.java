package com.company;

import java.util.Arrays;

public class Question_137 {
    public int singleNumber(int[] nums) {
        /*
        Time :	O(n)
        Space :	O(1)
         */
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
//        Single Number II
        Question_137 obj = new Question_137();
        int[] arr = {2,2,3,2};
        System.out.println(obj.singleNumber(arr));
    }
}
