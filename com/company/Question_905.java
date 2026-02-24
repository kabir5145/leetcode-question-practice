package com.company;

import java.util.Arrays;

public class Question_905 {
    public int[] sortArrayByParity(int[] nums) {
        /*
        Time → O(n) (single pass)
        Space → O(1) (in-place)
        */
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // If left is odd and right is even → swap
            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            // Move left pointer if already even
            if (nums[left] % 2 == 0) {
                left++;
            }

            // Move right pointer if already odd
            if (nums[right] % 2 == 1) {
                right--;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
//        Sort Array By Parity
        Question_905 q = new Question_905();
        int[] arr = q.sortArrayByParity(new int[]{3, 4, 6, 5});
        System.out.println(Arrays.toString(arr));
    }
}
