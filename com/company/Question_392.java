package com.company;

public class Question_392 {
    public boolean isSubsequence(String s, String t) {
        /*
        Time: O(m)
        Space: O(1)
         */
        int n  = s.length();
        int m  = t.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
    public static void main(String[] args) {
//        Is Subsequence
        Question_392 q = new Question_392();
        System.out.println(q.isSubsequence("abc", "ahbgdc"));
    }
}
