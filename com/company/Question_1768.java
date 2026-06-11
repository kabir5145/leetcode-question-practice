package com.company;

public class Question_1768 {
    public String mergeAlternately(String word1, String word2) {
        /*
        Time Complexity: O(n + m)
        Space Complexity: O(n + m)
         */
        int n = word1.length();
        int m = word2.length();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i  < n || i < m; i++) {
            if(i < n){
                res.append(word1.charAt(i));
            }
            if(i < m){
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
//        Merge Strings Alternately
        Question_1768 q = new Question_1768();
        System.out.println(q.mergeAlternately("abc", "pqr"));
    }
}
