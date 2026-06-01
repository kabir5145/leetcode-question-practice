package com.company;

import java.util.HashMap;

public class Question_1004 {
    public int longestOnes(int[] nums, int k) {
        /*
        Time : O(n)
        space : O(1)
         */
        int n = nums.length;
        int l = 0;
        int zero = 0;
        int ans = 0;

        for(int r = 0; r < n; r++) {
            if(nums[r] == 0) {
                zero++;
            }
            while(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
//        Max Consecutive Ones III
        Question_1004 q = new Question_1004();
        System.out.println(q.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(q.longestOnes(new int[]{0,0,0,0}, 0));
    }
}
