package com.company;

public class Question_48 {
    public void rotate(int[][] matrix) {
        /*
        Time: O(n²)
        Space: O(1) (in-place)
         */
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Rotate Image
        Question_48 q = new Question_48();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        q.rotate(matrix);
    }
}
