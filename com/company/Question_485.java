package com.company;

import java.util.HashMap;

public class Question_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        /*
        Time : O(n)
        Space : O(1)
         */
        int count = 0;
        int max = 0;

        for(int num : nums){
            if(num == 1){
               count++;
               max = Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
//        Max Consecutive Ones
        Question_485 q = new Question_485();
        System.out.println(q.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
