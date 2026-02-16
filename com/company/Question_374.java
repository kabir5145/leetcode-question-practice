package com.company;

public class Question_374 {
/*
    Time Complexity	O(log n)
    Space Complexity	O(1)
*/
    private int pick;

    public Question_374(int pick) {
        this.pick = pick;
    }

    // Simulated guess API
    private int guess(int num) {
        if (num == pick) return 0;
        return num > pick ? -1 : 1;
    }

    public int guessNumber(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Guess Number Higher or Lower
        Question_374 q = new Question_374(6); // suppose pick = 6
        System.out.println(q.guessNumber(10));
    }
}
