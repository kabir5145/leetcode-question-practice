package com.company;

public class First_Palindromic_String {
    public String firstPalindrome(String[] words) {

        // Approach 1: Reverse string (easy but extra space)
        /*
        for (String w : words) {
            StringBuilder reversed = new StringBuilder(w).reverse();
            if (w.contentEquals(reversed)) {
                return w;
            }
        }
        return "";
         */

        // Approach 2: Two pointers (optimized)

        //    Time: O(total characters) across all words
        //    Space: O(1)
            for (String w : words) {
                if (isPalindrome(w)) return w;
            }
            return "";
        }

        private boolean isPalindrome(String s) {
            int l = 0, r = s.length() - 1;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) return false;
                l++;
                r--;
            }
            return true;
        }

    public static void main(String[] args) {
        //Find First Palindromic String in the Array
        First_Palindromic_String p = new First_Palindromic_String();
        System.out.println(p.firstPalindrome(new String[]{"car","dad"}));
    }
}
