package com.company;

import java.util.Arrays;

public class Question_594 {
    public int findLHS(int[] nums) {
        /*
        Time : O(n log n)
        Space : O(1)
         */
        Arrays.sort(nums);
        int n = nums.length;
        int j = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            while(nums[i] - nums[j] > 1){
                j++;
            }
            if(nums[i] - nums[j] == 1){
                max = Math.max(max,i - j + 1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
//        Longest Harmonious Subsequence
        Question_594 q = new Question_594();
        System.out.println(q.findLHS(new int[]{1,3,2,2,5,2,3,7}));
    }
}
