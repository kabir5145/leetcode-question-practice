package com.company;

public class Binary_Search {
    public int search(int[] nums, int target) {

        //    Binary Search in Sorted Array
        //    Time Complexity: O(log n)
        //    Space Complexity: O(1)

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Binary search
        Binary_Search bs = new Binary_Search();
        System.out.println(bs.search(new int[]{1, 3, 4, 5}, 6));
        System.out.println(bs.search(new int[]{1, 3, 4, 5,7}, 7));
    }
}
