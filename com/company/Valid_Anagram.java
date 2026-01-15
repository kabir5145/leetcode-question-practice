package com.company;

import java.util.Arrays;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
    public static void main(String[] args) {

        // Time Complexity: O(n log n) due to sorting
        // Space Complexity: O(n) for character arrays

        Valid_Anagram av = new Valid_Anagram();
        System.out.println(av.isAnagram("abcd", "abcde"));

    }
}
