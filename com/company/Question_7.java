package com.company;

public class Question_7 {
    public int reverse(int x) {
        int n = 0;

        while (x != 0) {
            int temp = x % 10;

            // Check for overflow before multiplying
            if (n > Integer.MAX_VALUE / 10 ||
                    (n == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }

            if (n < Integer.MIN_VALUE / 10 ||
                    (n == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }

            n = n * 10 + temp;
            x /= 10;
        }

        return n;
    }

    public static void main(String[] args) {
//        Reverse Integer
        Question_7 q = new Question_7();
        System.out.println(q.reverse(123));
    }
}
