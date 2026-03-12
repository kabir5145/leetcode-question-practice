package com.company;
import java.util.Arrays;

public class Question_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        /*
        Time Complexity = O(n × m)
        Space Complexity = O(n × m)
         */
        int n = mat.length, m = mat[0].length;
        if (r * c != n * m)return mat;
        int[][] res = new int[r][c];
        for (int i = 0; i < r*c; i++) {
            res[i/c][i%c] = mat[i/m][i%m];
        }
        return res;
    }
    public static void main(String[] args) {
//        Reshape the Matrix
        Question_566 q = new Question_566();
        int[][] arr = new int[][]{
                {1,2,3}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(Arrays.deepToString(q.matrixReshape(arr, i, j)));
            }
        }
    }
}
