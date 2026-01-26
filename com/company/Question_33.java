package com.company;

public class Question_33 {
    public int search(int[] nums, int target) {

//        Time: O(log n)
//        Space: O(1)

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
//        Search in Rotated Sorted Array
        Question_33 q = new Question_33();
        System.out.println(q.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 0));
    }
}
