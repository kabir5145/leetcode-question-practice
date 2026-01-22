package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public int majorityElement(int[] nums) {

//        Time Complexity: O(n log n)
//        Space Complexity: O(log n)
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[n - i - 1]) {
                return nums[n - i - 1];
            }
        }
        return -1;
        /*

        Time Complexity: O(n)
        Space Complexity: O(n)

        int n =  nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n/2) {
                result = entry.getKey();
            }
        }
        return result;
        */
    }
    public static void main(String[] args) {
        Majority_Element majority_element = new Majority_Element();
        System.out.println(majority_element.majorityElement(new int[]{1, 2,2, 3, 4}));
    }
}
