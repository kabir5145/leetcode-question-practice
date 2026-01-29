package com.company;

import java.util.Arrays;

public class Question_287 {
    public int findDuplicate(int[] nums) {

//        Floyd’s Algorithm
//        Time: O(n)
//        Space: O(1)

            int slow = nums[0];
            int fast = nums[0];

            // Phase 1: Detect cycle
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            // Phase 2: Find entry point of cycle
            slow = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;

            //Binary search solution
            /*
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                high = mid;      // duplicate in left half
            } else {
                low = mid + 1;   // duplicate in right half
            }
        }
        return low;

        Time: O(n log n)
        Space: O(1)
             */
    }
    public static void main(String[] args) {
//        Find the Duplicate Number
        Question_287 q = new Question_287();
        System.out.println(q.findDuplicate(new int[]{1,2,2,4,5}));
    }
}
