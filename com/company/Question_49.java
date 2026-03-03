package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Time complexity : O(n k log k)
        Space complexity : O(nk)
         */
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for (String key : map.keySet()) {
            ans.add(new ArrayList<>(map.get(key)));
        }
        return ans;
    }

    public static void main(String[] args) {
//        Group Anagrams
        Question_49 q = new Question_49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(q.groupAnagrams(strs));
    }
}
