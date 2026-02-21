package com.company;

public class Question_917 {
    public String reverseOnlyLetters(String s) {
        /*
        Two Pointer Approach:
        Traverse from both ends and swap only letters,
        skipping non-letter characters.

        Time: O(n)
        Space: O(n)
        */
        if(s == null || s.length() <= 1) return s;
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer until it points to a letter
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // Move right pointer until it points to a letter
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            // Both are letters → swap them
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
//        Reverse Only Letters
        Question_917 q = new Question_917();
        System.out.println(q.reverseOnlyLetters("abcdefg"));
    }
}
