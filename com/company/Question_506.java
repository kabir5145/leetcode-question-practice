package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Question_506 {
    public String[] findRelativeRanks(int[] score) {
        /*
        Time: O(n log n)
        Space: O(n)
         */
        int n = score.length;
        String[] res = new String[n];

        int[] sorted = score.clone();
        Arrays.sort(sorted);


        HashMap<Integer, String> map = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            int rank = n - i;

            if (rank == 1) map.put(sorted[i], "Gold Medal");
            else if (rank == 2) map.put(sorted[i], "Silver Medal");
            else if (rank == 3) map.put(sorted[i], "Bronze Medal");
            else map.put(sorted[i], String.valueOf(rank));
        }

        for (int i = 0; i < n; i++) {
            res[i] = map.get(score[i]);
        }

        return res;
    }
    public static void main(String[] args) {
//        Relative Ranks
        Question_506 q = new Question_506();
        System.out.println(Arrays.toString(q.findRelativeRanks(new int[]{3,4,2,1})));
    }
}
