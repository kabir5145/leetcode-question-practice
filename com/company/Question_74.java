package com.company;

public class Question_74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        /*
        Time Complexity: O(m × n)
        Space Complexity: O(1)
        */

        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
            low = mid + 1;
            high = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
//        Search a 2D Matrix
        Question_74 obj = new Question_74();
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
        };
        System.out.println(obj.searchMatrix(matrix, 12));
    }
}
