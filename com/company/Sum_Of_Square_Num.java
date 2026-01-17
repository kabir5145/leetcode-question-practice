package com.company;

public class Sum_Of_Square_Num {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);

        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) return true;
            if (sum < c) left++;
            else right--;
        }
        return false;
    }
    public static void main(String[] args) {
/*
        Final Time Complexity: O(c)
        Space Complexity: O(1)
 */
        Sum_Of_Square_Num obj = new Sum_Of_Square_Num();
        System.out.println(obj.judgeSquareSum(5));
        System.out.println(obj.judgeSquareSum(6));
    }
}
