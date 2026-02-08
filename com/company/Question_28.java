package com.company;

public class Question_28 {
    /*
    Time complexity : O(n*m)
    Space complexity : O(1)
     */
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Find the Index of the First Occurrence in a String
        Question_28 q = new Question_28();
        System.out.println(q.strStr("sadbutsad","sad"));
    }
}
