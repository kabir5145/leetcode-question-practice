package com.company;

public class Question_50 {
    public double myPow(double x, int n) {
        /*
        Time Complexity  : O(log n)
        Space Complexity : O(1)
         */
        if (n == 0) {
            return 1.0;
        }
        long N = n;   // avoid overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;

        while (N > 0) {

            if ((N & 1) == 1) {
                result *= x;
            }

            x *= x;
            N >>= 1;
        }

        return result;
    }
    public static void main(String[] args) {
//        Pow(x, n)
        Question_50 q = new Question_50();
        System.out.println(q.myPow(2, 2));
    }
}
