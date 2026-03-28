package com.company;

import java.util.Arrays;

public class Question_1051 {
    public int heightChecker(int[] heights) {
        /*
        Time complexity : O(n log n)
        Space complexity : O(n)
         */
        int []expected = heights.clone();
        Arrays.sort(heights);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        Height Checker
        Question_1051 q = new Question_1051();
        System.out.println(q.heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
