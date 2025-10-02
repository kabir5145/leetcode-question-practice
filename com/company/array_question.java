package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Solution_4 {
    public int removeElement(int[] nums, int val) {
        int k = 0; // index for the new array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // keep only non-val elements
                k++;
            }
        }
        return k; // new length
    }
}
public class array_question {
    public static void main(String[] args) {
        //Question 4:Remove Element.
        Solution_4 s = new Solution_4();
        System.out.println(s.removeElement(new int[]{1, 2, 3, 2, 3, 2,},2));
    }
}
