package com.company;

public class Question_154 {
    public int findMin(int[] nums) {

/*
        Time Complexity:

        Average case: O(log n)

        Worst case (duplicates): O(n)

        Space Complexity: O(1)
 */

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid]<nums[right]){
                right = mid;
            } else {
                right--;
            }
        }
        return nums[right];
    }

    public static void main(String[] args) {

//        Find Minimum in Rotated Sorted Array II

        Question_154 q = new Question_154();
        System.out.println(q.findMin(new int[]{1,2,3,4,5}));
    }
}
