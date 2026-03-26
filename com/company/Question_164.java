package com.company;

import java.util.Arrays;

public class Question_164 {
    public int maximumGap(int[] nums) {
        /*
        Time	O(n log n)
        Space	O(log n)
         */
        if (nums == null || nums.length <2) {
            return 0;
        }
        Arrays.sort(nums);
        int  maxGap = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxGap = Math.max(maxGap, nums[i+1] - nums[i]);
        }
        return maxGap;
    }
    public static void main(String[] args) {
//        Maximum Gap
        Question_164 q = new Question_164();
        System.out.println(q.maximumGap(new int[]{3,6,9,1}));
        System.out.println(q.maximumGap(new int[]{10}));
    }
}
