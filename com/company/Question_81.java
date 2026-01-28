package com.company;

public class Question_81 {
    public boolean search(int[] nums, int target) {

//        Average: O(log n)
//        Worst case (all duplicates): O(n) ← unavoidable

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            // Left half sorted
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        Search in Rotated Sorted Array II
        Question_81 q = new Question_81();
        System.out.println(q.search(new int[]{2,5,6,0,0,1,2}, 0));
    }
}
