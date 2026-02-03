package com.company;

public class Question_80 {
    public int removeDuplicates(int[] nums) {
        /*
        Time	:O(n)
        Space	:O(1)
         */
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
//        Remove Duplicates from Sorted Array II
        Question_80 q = new Question_80();
        System.out.println(q.removeDuplicates(new int[]{1,2,2,3,4,5}));
    }
}
