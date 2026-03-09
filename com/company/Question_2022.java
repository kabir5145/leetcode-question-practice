package com.company;

public class Question_2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
//        Time Complexity :O(m*n)
//        Space Complexity :O(m*n)
        if(original.length != m*n) return new int[0][0];
        int[][] res = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            res[i/n][i%n] = original[i];
        }
        return res;
    }
    public static void main(String[] args) {
//        Convert 1D Array Into 2D Array
        Question_2022 q = new Question_2022();
        int[][] grid = q.construct2DArray(new int[]{1,2,3,4}, 2,2);
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
