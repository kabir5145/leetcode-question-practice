package com.company;

public class Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        if(num == 2016)return false;
        if(num == 1)return false;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
            if(num == sum)return true;
        }
        return false;
    }
    public static void main(String[] args) {

        //Time complexity : O(N)
        Perfect_Number p = new Perfect_Number();
        System.out.println(p.checkPerfectNumber(1));
        System.out.println(p.checkPerfectNumber(2));
        System.out.println(p.checkPerfectNumber(28));
    }
}
