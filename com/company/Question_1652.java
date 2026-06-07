package com.company;

import java.util.Arrays;

public class Question_1652 {
    public int[] decrypt(int[] code, int k) {
        /*
        TC = O(n × |k|)
        SC = O(n)
         */
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;

            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }

            ans[i] = sum;
        }

        return ans;
    }
    public static void main(String[] args) {
//        Defuse the Bomb
        Question_1652 q = new Question_1652();
        System.out.println(Arrays.toString(q.decrypt(new int[]{10,5,2,6}, 3)));

    }
}
