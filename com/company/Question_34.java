package com.company;

import java.util.Arrays;

public class Question_34 {

//    Time Complexity: O(log n)
//    Space Complexity: O(1)

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        Find First and Last Position of Element in Sorted Array
        Question_34 q = new Question_34();
        int[] nums = new int[]{4,5,6,7,9,9,10};
        int target = 0;
        System.out.println(Arrays.toString(q.searchRange(nums, target)));
    }
}
