package com.company;

import java.util.Arrays;
import java.util.TreeSet;

public class Question_220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        // LeetCode 220 - Contains Duplicate III
        // Approach 1: Brute Force
        // Time: O(n^2)
        // Space: O(1)

//        int n = nums.length;
//
//        for (int i = 0; i < n; i++)
//            for (int j = i + 1; j < n; j++)
//                if (Math.abs((long)(nums[i] - nums[j])) <= valueDiff && j - i <= indexDiff)
//                    return true;
//
//        return false;


        /*
        Use Sliding Window + TreeSet.
        1. Maintain window of size indexDiff
        2. Use ceiling() to find number ≥ nums[i] - valueDiff
        3. Check if ≤ nums[i] + valueDiff
        4. Remove nums[i-indexDiff] to maintain window

        Time Complexity: O(n log k)
        Space Complexity: O(k)
         */
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            Long candidate = set.ceiling((long) nums[i] - valueDiff);

            if (candidate != null && candidate <= (long) nums[i] + valueDiff) {
                return true;
            }

            set.add((long) nums[i]);

            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
//        Contains Duplicate III
        Question_220 q = new Question_220();
        int[] arr = {1,2,3,1};
        System.out.println(q.containsNearbyAlmostDuplicate(arr, 3, 0));
    }
}
