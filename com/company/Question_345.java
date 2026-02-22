package com.company;

public class Question_345 {
    public String reverseVowels(String s) {
        /*
        Used Two Pointer approach to reverse vowels in a string by scanning from both ends and swapping vowels.
        Time Complexity: O(n)
        Space Complexity: O(n)
         */
        if (s == null )return null;
        char [] ch = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (right >= left) {
            if (ch[left] != 'A' && ch[left] != 'E' && ch[left] != 'I' && ch[left] != 'O' && ch[left] != 'U'
                    && ch[left] != 'a' && ch[left] != 'e' && ch[left] != 'i' && ch[left] != 'o' && ch[left] != 'u') {
                left++;
                continue;
            }

            if (ch[right] != 'A' && ch[right] != 'E' && ch[right] != 'I' && ch[right] != 'O' && ch[right] != 'U'
                    && ch[right] != 'a' && ch[right] != 'e' && ch[right] != 'i' && ch[right] != 'o' && ch[right] != 'u') {
                right--;
                continue;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
//        Reverse Vowels of a String
        Question_345 q = new Question_345();
        System.out.println(q.reverseVowels("leetcode"));
    }
}
