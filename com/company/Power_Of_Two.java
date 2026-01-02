package com.company;

public class Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1 || n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return false;
    }
    public static void main(String[] args) {
        //Power of two
        Power_Of_Two p = new Power_Of_Two();
        System.out.println(p.isPowerOfTwo(1));
        System.out.println(p.isPowerOfTwo(2));
        System.out.println(p.isPowerOfTwo(3));
    }
}
