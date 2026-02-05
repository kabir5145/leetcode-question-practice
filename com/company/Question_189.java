package com.company;

import java.util.Arrays;

public class Question_189 {
    public void rotate(int[] nums, int k) {
/*
        Time Complexity: O(n)
        Space Complexity: O(1)
 */
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

    }
    public static void main(String[] args) {
//        Rotate Array
        Question_189 q = new Question_189();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        q.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
