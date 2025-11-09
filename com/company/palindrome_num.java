package com.company;

public class palindrome_num {
    public boolean isPalindrome(int x) {
       if(x<0)return false;

       int original = x;
       int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
    public static void main(String[] args) {
        palindrome_num n = new palindrome_num();
        System.out.println(n.isPalindrome(212));
    }
}
