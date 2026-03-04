package com.company;
import java.util.*;

public class Question_229 {
    public List<Integer> majorityElement(int[] nums) {
        /*
        Time Complexity :	O(n)
        Space Complexity :	O(n)
         */
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
    public static void main(String[] args) {
//        Majority Element II
        Question_229 q = new Question_229();
        List<Integer> ans = q.majorityElement(new int[]{1, 2, 3, 4, 5, 6, 6});
        System.out.println(ans);
    }
}
