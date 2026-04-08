package com.company;

public class Question_1413 {
    public int minStartValue(int[] nums) {
        /*
        Time : O(n)
        Space : O(n)
         */
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i -1] + nums[i];
        }

        int minPrefix = prefix[0];
        for (int i = 1; i < n; i++) {
            minPrefix = Math.min(minPrefix,prefix[i]);
        }
        return Math.max(1,1-minPrefix);
    }
    public static void main(String[] args) {
//       Minimum Value to Get Positive Step by Step Sum
        Question_1413 q = new Question_1413();
        System.out.println(q.minStartValue(new int[]{-3,2,-3,4,2}));
    }
}
