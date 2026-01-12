package com.company;

import java.util.Arrays;

public class Sum_Zero {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) {
            res[left++] = start;
            res[right--] = -start;
            start++;
        }
        return res;
/*
        public int[] sumZero(int n) {
            int[] res = new int[n];
            int index = 0;

            // Put pairs (i, -i)
            for (int i = 1; i <= n / 2; i++) {
                res[index++] = i;
                res[index++] = -i;
            }

            // If n is odd, middle element remains 0 automatically
            return res;
        }
 */
    }
    public static void main(String[] args) {
        //Find N Unique Integers Sum up to Zero
        Sum_Zero s = new Sum_Zero();
        int[] result = s.sumZero(5);
        System.out.println(Arrays.toString(result));
    }
}
