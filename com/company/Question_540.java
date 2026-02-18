package com.company;

public class Question_540 {
    public int singleNonDuplicate(int[] nums) {
        /*
        Time	: O(log n)
        Space	: O(1)
        */
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = l+(r - l) / 2;
            //Make the mid even
            if(mid % 2 == 1){
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                l = mid + 2;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
//        Single Element in a Sorted Array
        Question_540 p = new Question_540();
        int[] nums = new int[]{1,1,2,2,3,4,4};
        System.out.println(p.singleNonDuplicate(nums));
    }
}
