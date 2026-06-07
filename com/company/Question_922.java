package com.company;

import java.util.Arrays;

public class Question_922 {
    public int[] sortArrayByParityII(int[] nums) {
        /*
        Time Complexity : O(n)
        Space Complexity : O(1)
         */
        int n = nums.length;
        int l = 0;
        int r = 1;

        while (l < n && r < n) {
            while (l < n && nums[l] % 2 == 0) l = l + 2;
            while (r < n && nums[r] % 2 == 1) r = r + 2;

            if (l < n && r < n) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
//        Sort Array By Parity II
        Question_922 q = new Question_922();
        int[] nums = q.sortArrayByParityII(new int[]{4,2,5,7});
        System.out.println(Arrays.toString(nums));
    }
}
