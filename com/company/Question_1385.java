package com.company;

import java.util.Arrays;

public class Question_1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        /*
        Time Complexity: O(n × m)
        Space Complexity: O(1)
         */
        int ans = 0;

        for (int k : arr1) {
            boolean valid = true;

            for (int i : arr2) {
                if (Math.abs(k - i) <= d) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        Find the Distance Value Between Two Arrays
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        int res = new Question_1385().findTheDistanceValue(arr1, arr2, d);

        System.out.println("Answer: " + res);
    }
}
