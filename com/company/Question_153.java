package com.company;

public class Question_153 {
    public int findMin(int[] nums) {

//        Approach 1: Brute Force
//        Time: O(n), Space: O(1)
//        Simple scan to find minimum

        /*
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
         */

//    This solution works in O(n), but since the array is
//    sorted and rotated, we can optimize it using binary search to O(log n).


//        Time Complexity: O(log n)
//        Space Complexity: O(1)
//        Approach 2: Optimized Binary Search
//        Uses sorted + rotated property


        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        //Find Minimum in Rotated Sorted Array
        Question_153 q = new Question_153();
        System.out.println(q.findMin(new int[]{1, 2, 3, 4, 5}));
        System.out.println(q.findMin(new int[]{6, 3, 4, 5}));
    }
}
