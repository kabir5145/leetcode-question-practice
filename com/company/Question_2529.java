package com.company;

import java.util.Arrays;

public class Question_2529 {
    public int maximumCount(int[] nums) {
        /*
        Approach: Linear scan
        Time Complexity: O(n)
        Space Complexity: O(1)
         */
        int neg = 0;
        int pos = 0;

        for (int num : nums) {
            if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            }
        }
        return Math.max(neg, pos);
    }
    public static void main(String[] args) {
//        Maximum Count of Positive Integer and Negative Integer
        Question_2529 q = new Question_2529();
        System.out.println(q.maximumCount(new int[]{-3,-4,-5,6,7,8,9}));
    }
}
