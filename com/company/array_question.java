package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int g = 0;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] != nums[g]) {
                    nums[++g] = nums[i];
                }
        }return g+1;
    }
}
public class array_question {
    public static void main(String[] args) {
        //Question 3: Given an integer array nums sorted in non-decreasing order,
        // remove the duplicates in-place such that each unique element appears only once.
        // The relative order of the elements should be kept the same.
        // Then return the number of unique elements in nums.
        Solution s = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};  // Example input

        int newLength = s.removeDuplicates(nums);

        // Print only the "new" array part (unique elements)
        System.out.println("New length = " + newLength);
        System.out.println("Unique elements = " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
