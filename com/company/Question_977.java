package com.company;

import java.util.Arrays;

public class Question_977 {
    public int[] sortedSquares(int[] nums) {
        /*
        Time Complexity: O(n log n)
        Space Complexity: O(n)
        */
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {
//        Squares of a Sorted Array
        Question_977 q = new Question_977();
        int[] arr = new int[]{-2,0,2,1,-2,4};
        arr = q.sortedSquares(arr);
        System.out.println(Arrays.toString(arr));
    }
}
