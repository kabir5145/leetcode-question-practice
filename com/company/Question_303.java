package com.company;

import java.util.Arrays;

public class Question_303 {
    /*
    Time : O(1)
    Space : O(1)
     */
    int[] prefix;

    public void NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            prefix[i] = prefix[i - 1] + nums[i];
    }

    public int sumRange(int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
    public static void main(String[] args) {
//        Range Sum Query - Immutable
        Question_303 q = new Question_303();
        int[] nums = new int[]{-2, -3, -4, -1, -2, 1, -5, 4};
        q.NumArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
