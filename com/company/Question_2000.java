package com.company;

public class Question_2000 {
    public String reversePrefix(String word, char ch) {
        /*
        Time complexity : O(N)
        Space complexity : O(N)
         */
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        char[] chars = word.toCharArray();
        int left = 0;
        int right = index;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
    public static void main(String[] args) {
//        Reverse Prefix of Word
        Question_2000 q = new Question_2000();
        System.out.println(q.reversePrefix("hello", 'e'));
        System.out.println(q.reversePrefix("abcdefd", 'd'));
    }
}
