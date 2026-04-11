package com.company;

import java.util.Arrays;

public class Question_238 {
    public int[] productExceptSelf(int[] nums) {
        /*
        Time : O(n)
        Space : O(1)
         */
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suffix;
            suffix = nums[i] * suffix;
        }
        return res;
    }
    public static void main(String[] args) {
//        Product of Array Except Self
        Question_238 q = new Question_238();
        int[] nums = {1,2, 3, 4};
        System.out.println(Arrays.toString(q.productExceptSelf(nums)));
    }
}
