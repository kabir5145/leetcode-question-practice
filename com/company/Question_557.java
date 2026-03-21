package com.company;

import java.util.Arrays;

public class Question_557 {
    public String reverseWords(String s) {
//        String[] words = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (String word : words) {
//            StringBuilder temp = new StringBuilder(word);
//            sb.append(temp.reverse()).append(" ");
//        }
//        return sb.toString().trim();


//        Most  optimized  solution
        /*
        Time Complexity: O(n)
        Space complexity: O(n)
         */

        char[] arr = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
//        Reverse Words in a String III
        Question_557 q = new Question_557();
        System.out.println(q.reverseWords("Let's take LeetCode contest"));
    }
}
