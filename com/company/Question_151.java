package com.company;

import java.util.Arrays;

public class Question_151 {
    public String reverseWords(String s) {
        /*
        Approach: Two pointers
        Time: O(n)
        Space: O(n) (extra array)
         */
        String[] words = s.trim().split(" ");

        int l = 0, r = words.length - 1;
        while (l < r) {
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;

            l++;
            r--;
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
//        Reverse Words in a String
        Question_151 q = new Question_151();
        System.out.println(q.reverseWords("the sky is blue"));
        System.out.println(q.reverseWords(" hello world "));
    }
}
