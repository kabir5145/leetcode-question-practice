package com.company;

import java.util.HashMap;

public class Question_424 {
    public int characterReplacement(String s, int k) {
        /*
        Time : O(n)
        space : O(1)
         */
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
//        Longest Repeating Character Replacement
        Question_424 q = new Question_424();
        System.out.println(q.characterReplacement("AABABBA", 2));
    }
}
