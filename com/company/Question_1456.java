package com.company;


public class Question_1456 {
    /*
    Time: O(n)
    Space: O(1)
     */
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int n  = s.length();
        int maxVowels = 0;
        int vowels = 0;
        int l = 0;

        for (int r = 0; r < n; r++) {
            if(isVowel(s.charAt(r))){
                vowels++;
            }
            if((r - l + 1) == k){
                maxVowels = Math.max(maxVowels, vowels);
                if(isVowel(s.charAt(l)))vowels--;
                l++;
            }
        }
        return maxVowels;
    }
    public static void main(String[] args) {
//        Maximum Number of Vowels in a Substring of Given Length
        Question_1456 q = new Question_1456();
        System.out.println(q.maxVowels("abciiidef", 3));
    }
}
