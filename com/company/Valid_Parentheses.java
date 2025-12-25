package com.company;

import java.util.Stack;

public class Valid_Parentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if( (c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        //Valid Parentheses
        Valid_Parentheses obj = new Valid_Parentheses();
        System.out.println(obj.isValid("(}"));
        System.out.println(obj.isValid("{[]}"));
        System.out.println(obj.isValid("([)]"));
        System.out.println(obj.isValid("{}"));
    }
}
