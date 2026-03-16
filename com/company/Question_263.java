package com.company;

public class Question_263 {
    public boolean isUgly(int n) {
        /*
         Time Complexity	O(log n)
         Space Complexity	O(log n) (due to recursion stack)
         */
        if(n<=0)return false;
        if(n == 1 )return true;
        if(n % 2 == 0)return isUgly(n/2);
        if(n % 3 == 0)return isUgly(n/3);
        if(n % 5 == 0)return isUgly(n/5);
        return false;
    }
    public static void main(String[] args) {
//         Ugly Number
        Question_263 q = new Question_263();
        System.out.println(q.isUgly(1));
        System.out.println(q.isUgly(14));
    }
}
