package com.company;

import java.util.HashMap;

import java.util.Map;

public class Question_904 {
    public int totalFruit(int[] fruits) {
        /*
        Time Complexity: O(n)
        Space Complexity: O(1)
         */
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
//        Fruit Into Baskets
        Question_904 q = new Question_904();
        System.out.println(q.totalFruit(new int[]{1,2,1}));
        System.out.println(q.totalFruit(new int[]{1,2,3,2,2}));
    }
}
