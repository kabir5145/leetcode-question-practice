package com.company;

public class Question_53 {
    public int maxSubArray(int[] nums) {
        /*
        Time : O(n)
        Space : O(1)
         */
            int max = nums[0];
            int currentSum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                max = Math.max(max, currentSum);
            }
            return max;
    }
    public static void main(String[] args) {
//        Maximum Subarray
        Question_53 obj = new Question_53();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(arr));
    }
}
