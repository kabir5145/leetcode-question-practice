package com.company;

import java.util.Arrays;

public class Question_75 {
    public void sortColors(int[] nums) {
        /*
        Time Complexity: O(n) (Single pass)
        Space Complexity: O(1) (In-place)
        */

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
//        Sort Colors
        Question_75 q = new Question_75();
        int[] nums = new int[]{2,0,2,1,1,1,1,1};
        q.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
