package com.company;

public class String_question {
    class Solution {
        public boolean isPalindrome(String s) {
            char [] arr = s.toCharArray();
            int start = 0;
            int end = s.length()-1;

            while (start<end){
                if(arr[start]!=arr[end]){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
    public static void main(String[] args) {

    }
}
