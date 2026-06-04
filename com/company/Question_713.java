package com.company;

import java.util.Arrays;

public class Question_713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        /*
        Time : O(n)
        Space : O(1)
         */
        if (k <= 1) return 0;

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
    public static void main(String[] args) {
//        Subarray Product Less Than K
        Question_713 q = new Question_713();
        System.out.println(q.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }
}
