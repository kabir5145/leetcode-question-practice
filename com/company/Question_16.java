package com.company;

import java.util.Arrays;

public class Question_16 {
    public int threeSumClosest(int[] nums, int target) {
        /*
         Time Complexity
         Sorting: O(n log n)
         Two nested loops effectively: O(n²)
         Overall: O(n²)
         */
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // If exact match found, return immediately
                if (sum == target) {
                    return sum;
                }

                // Update closest if this sum is better
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers
                if (sum < target) {
                    left++;   // increase sum
                } else {
                    right--;  // decrease sum
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        /*
        Input: nums = [-1,2,1,-4], target = 1
        Output: 2
        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
        */

//          3Sum Closest
        Question_16 q = new Question_16();
        System.out.println(q.threeSumClosest(new int[]{-1,0,1,2,-1,-4}, 0));
    }
}
