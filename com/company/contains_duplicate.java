package com.company;


public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean isTrue = true;
        for (int i = 0; i < nums.length; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    return isTrue;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        contains_duplicate c = new contains_duplicate();
        int[]nums = {1,2,5,3,1};
        c.containsDuplicate(nums);
    }
}