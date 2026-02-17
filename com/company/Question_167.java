package com.company;

import java.util.Arrays;

public class Question_167 {
    public int[] twoSum(int[] numbers, int target) {
        /*
        Time Complexity: O(n)
        Space Complexity: O(1)
         */
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            if (sum > target) {
                right--;
            }
            if (sum < target) {
                left++;
            }
        }
        return null;
    }
    public static void main(String[] args) {
//        Two Sum II - Input Array Is Sorted
        Question_167 q = new Question_167();
        System.out.println(Arrays.toString(q.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(q.twoSum(new int[]{1,2,3,4,5}, 6)));
    }
}
