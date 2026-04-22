package com.company;

import java.util.Arrays;

public class Question_561 {
    public int arrayPairSum(int[] nums) {
        /*
        Time : O(n log n)
        Space : O(log n)
         */
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
    public static void main(String[] args) {
//        Array Partition
        Question_561 q = new Question_561();
        System.out.println(q.arrayPairSum(new int[]{1,4,3,2}));
    }
}
