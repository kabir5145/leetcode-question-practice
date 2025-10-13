package com.company;

import javax.sound.midi.Soundbank;

public class Array {
    static class Solution {
        public void moveZeroes(int[] nums) {
            int n = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i]!=0 && nums[n]==0){
                    int temp = nums[i];
                    nums[i]=nums[n];
                    nums[n]=temp;
                }
                if(nums[n]!=0){
                    n++;
                }
            }
            for(int x:nums){
                System.out.print(x+" ");
            }
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        s.moveZeroes(new int[]{0,0,3,4,5,2});

    }
}
