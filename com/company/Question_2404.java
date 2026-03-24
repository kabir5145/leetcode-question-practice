package com.company;

import java.util.HashMap;
import java.util.Map;

public class Question_2404 {
    public int mostFrequentEven(int[] nums) {
        /*
        Time Complexity: O(n)
        Space Complexity: O(n)
         */
        Map<Integer, Integer> map = new HashMap<>();

        // Count only even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int result = -1;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq || (freq == maxFreq && key < result)) {
                maxFreq = freq;
                result = key;
            }
        }

        return result;
    }
    public static void main(String[] args) {
//        Most Frequent Even Element
        Question_2404 q = new Question_2404();
        System.out.println(q.mostFrequentEven(new int[]{1,2,2,4,4}));
        System.out.println(q.mostFrequentEven(new int[]{4,4,4,9,2,4}));
    }
}
