package com.company;

public class Question_2520 {
    public int countDigits(int num) {
        int target = num;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if(target % digit == 0)count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
//        Count the Digits That Divide a Number
        Question_2520 q = new Question_2520();
        System.out.println(q.countDigits(15));
    }
}
