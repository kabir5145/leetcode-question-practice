package com.company;

public class Question_202 {
    // Time Complexity: O(d)
// d = number of digits in n (each digit is processed once per call)

// Since the number of recursive calls is bounded (enters a small cycle),
// overall time is effectively O(d).

// Space Complexity: O(1)
// Constant auxiliary space in practice (ignoring recursion stack),
// otherwise O(k) for recursion depth.

    public boolean isHappy(int n) {
        if(n == 1 || n == 7)return true;

        else if(n<10) return false;
        else{
            int s=0;
            while(n>0){
                int temp=n%10;
                s+= temp*temp;
                n=n/10;
            }
            return isHappy(s);
        }
    }
    public static void main(String[] args) {
//        Happy Number
        Question_202 q = new Question_202();
        System.out.println(q.isHappy(2));
        System.out.println(q.isHappy(19));
    }
}
