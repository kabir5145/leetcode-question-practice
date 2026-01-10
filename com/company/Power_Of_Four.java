package com.company;

public class Power_Of_Four {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    //By using a trick
    //return (n & (n - 1)) == 0 && n % 3 == 1;
    public static void main(String[] args) {
        Power_Of_Four p = new Power_Of_Four();
        System.out.println(p.isPowerOfFour(6));
    }
}
