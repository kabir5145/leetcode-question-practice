package com.company;

import java.util.Arrays;

public class Sum_Of_Unique_Elements {

    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i = 0;

        while (i < nums.length) {
            int count = 1;

            while (i + count < nums.length && nums[i] == nums[i + count]) {
                count++;
            }

            if (count == 1) sum += nums[i];
            i += count;
        }

        return sum;
    }

    public static void main(String[] args) {
        Sum_Of_Unique_Elements obj = new Sum_Of_Unique_Elements();
        System.out.println(obj.sumOfUnique(new int[]{1,2,3,2}));

    }
}
