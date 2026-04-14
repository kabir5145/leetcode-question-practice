package com.company;

public class Question_560 {
    public int subarraySum(int[] nums, int k) {
        /*
        Time : O(n²)
        Space : O(n)
         */
        int [] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(sum == k)ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//         Subarray Sum Equals K
        Question_560 q = new Question_560();
        int[] nums = new int[]{1,1,1};
        System.out.println(q.subarraySum(nums, 2));
    }
}
