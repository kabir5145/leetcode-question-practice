package com.company;

public class Question_1351 {
    public int countNegatives(int[][] grid) {
        /*
        Time complexity = O(m*n)
         */
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < cols; j++) {
                if (ints[j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        Count Negative Numbers in a Sorted Matrix
        Question_1351 obj = new Question_1351();
        int[][] grid = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, -1 }
        };
        System.out.println(obj.countNegatives(grid));
    }
}
