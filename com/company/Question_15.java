package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_15 {
    /*
    Time complexity: O(n²)
    Space complexity : O(1) (excluding output)
    */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                        left++;
                        right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < 0) {
                        left++;
                }
                else {
                        right--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
//        3Sum
        Question_15 q = new Question_15();
        List<List<Integer>> list = q.threeSum(new int[]{1,2,0,1,0,0,0,0});
        for (List<Integer> list1 : list) {
            for (List<Integer> list2 : list) {
                for (Integer integer : list2) {
                    System.out.print(integer + " ");
                }
            }
        }
    }
}
