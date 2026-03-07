package com.company;

import java.util.Arrays;

public class Question_867 {
    /*
       Time Complexity	O(m × n)
       Space Complexity	O(m × n)
     */
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        Transpose Matrix
        Question_867 q = new Question_867();
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(q.transpose(arr)));
    }
}
