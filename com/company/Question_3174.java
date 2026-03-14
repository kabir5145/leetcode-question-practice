package com.company;

import java.util.Stack;

public class Question_3174 {
    public String clearDigits(String s) {
        /*
        Time Complexity :	O(n)
        Space Complexity :	O(n)
         */
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
//        Clear Digits
        Question_3174 q = new Question_3174();
        System.out.println(q.clearDigits("cb34"));
        System.out.println(q.clearDigits("cbb4"));
    }
}
