package com.company;

public class Climbing_Stairs {
    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev1 = 1; // ways to reach step 0
        int prev2 = 1; // ways to reach step 1

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
    public static void main(String[] args) {
        Climbing_Stairs c = new Climbing_Stairs();
        System.out.println(c.climbStairs(3));
    }
}
