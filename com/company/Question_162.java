package com.company;

public class Question_162 {
    public int findPeakElement(int[] nums) {
        /*
        Time	: O(log n)
        Space	: O(1) (constant extra space)
        */

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
//        Find Peak Element
        Question_162 q = new Question_162();
        System.out.println(q.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}
