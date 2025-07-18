package com.company;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        /*
        The Fibonacci numbers, commonly denoted F(n) form a sequence,
        called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
        starting from 0 and 1. That is,
        F(0) = 0, F(1) = 1
        F(n) = F(n - 1) + F(n - 2), for n > 1.
         */
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i <= 30; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }
}
