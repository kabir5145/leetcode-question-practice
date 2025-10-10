package com.company;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++) {
            if ( nums[i]>=target) {
                return i;
            }
        }
        return n;
    }
}
public class array_question {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.searchInsert(new int[]{1,2,3,4},8));
    }
}
