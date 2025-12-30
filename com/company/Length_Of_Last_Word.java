package com.company;

public class Length_Of_Last_Word {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        Length_Of_Last_Word l = new Length_Of_Last_Word();
        System.out.println(l.lengthOfLastWord("Hello World And"));
    }
}
