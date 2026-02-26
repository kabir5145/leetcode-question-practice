package com.company;

public class Question_378 {
    public int kthSmallest(int[][] matrix, int k) {
        /*
        Time Complexity: O(n log(max-min))
        Space Complexity: O(1)
        */
        int m = matrix.length;
        int n = matrix[0].length;

        int low = matrix[0][0];
        int high = matrix[m - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private int countLessEqual(int[][] matrix, int mid) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = m - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }

        return count;
    }
    public static void main(String[] args) {
//        Kth Smallest Element in a Sorted Matrix
        Question_378 q = new Question_378();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(q.kthSmallest(matrix, 2));
    }
}
