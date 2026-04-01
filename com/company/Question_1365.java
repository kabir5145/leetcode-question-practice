package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*
        Time Complexity → O(n log n)
        Space Complexity → O(n)
         */
        Map<Integer, Integer> map = new HashMap<>();

        int[] copy  = nums.clone();
        Arrays.sort(copy);

        for (int i = 0; i < copy.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
                nums[i] = map.get(nums[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
//        How Many Numbers Are Smaller Than the Current Number
        Question_1365 q = new Question_1365();
        int[] res = q.smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        System.out.println(Arrays.toString(res));
    }
}
