package com.company;

import java.util.Arrays;

public class Question_179 {
    public String largestNumber(int[] nums) {
        /*
        Time Complexity : O(n log n)
        Space Complexity : O(n)
         */
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (a,b)-> (b+a).compareTo(a+b));

        if (strs[0].equals("0"))return "0";

        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
//         Largest Number
        Question_179 q = new Question_179();
        System.out.println(q.largestNumber(new int[]{3,40,2,1}));
    }
}
