package com.company;

import java.util.Arrays;

public class Question_1480 {
    public int[] runningSum(int[] nums) {
        /*
        Time Complexity : O(n)
        Space Complexity : O(n)
         */
        if (nums == null || nums.length == 0) return new int[0];
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) res[i] = res[i - 1] + nums[i];
        return res;
    }
    public static void main(String[] args) {
//        Running Sum of 1d Array
        Question_1480 q = new Question_1480();
        System.out.println(Arrays.toString(q.runningSum(new int[]{1,1,1,1,1})));
    }
}
