package com.company;

import java.util.Arrays;

public class Question_215 {
    public int findKthLargest(int[] nums, int k) {
        /*
        Time Complexity: O(n log n)
        Space Complexity: O(log n)
         */
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    public static void main(String[] args) {
//        Kth Largest Element in an Array
        Question_215 q = new Question_215();
        System.out.println(q.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        System.out.println(q.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
