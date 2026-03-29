package com.company;

public class Question_389 {
    public char findTheDifference(String s, String t) {
        /*
        Time Complexity: O(n)
        Space Complexity: O(1)
         */
        char c = 0;
        for (int i = 0; i < s.length(); i++) c ^= s.charAt(i);
        for (int i = 0; i < t.length(); i++) c ^= t.charAt(i);
        return (char) c;
    }
    public static void main(String[] args) {
//        Find the Difference
        Question_389 q = new Question_389();
        System.out.println(q.findTheDifference("abcd", "abcde"));
    }
}
