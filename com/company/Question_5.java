package com.company;

public class Question_5 {
    int start = 0;
    int maxLen = 0;

    public String longestPalindrome(String s) {
        /*
        Time: O(n²)
        Space: O(1)
         */

        for(int i = 0; i < s.length(); i++) {

            expand(s, i, i);

            expand(s, i, i + 1);
        }

        return s.substring(start, start + maxLen);
    }

    private void expand(String s, int left, int right) {

        while(left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            int len = right - left + 1;

            if(len > maxLen) {
                maxLen = len;
                start = left;
            }

            left--;
            right++;
        }
    }
    public static void main(String[] args) {
//        Longest Palindromic Substring
        Question_5 q = new Question_5();
        System.out.println(q.longestPalindrome("aba"));
    }
}
