package com.company;

public class Question_1572 {
    public int diagonalSum(int[][] mat) {
        /*
        Time → O(n)
        Space → O(1)
         */
        int s = 0,e = mat.length - 1;
        int sum = 0;
        for (int i = 0; i <= mat.length - 1; i++) {
            sum += mat[s][s];
            if (s != e) {
                sum += mat[s][e];
            }
            s++;
            e--;

        }
        return sum;
    }
    public static void main(String[] args) {
//        Matrix Diagonal Sum
        Question_1572 q = new Question_1572();
        int [][] mat = new int[][]{
                {1,2,3}
                ,{4,5,6}
                ,{7,8,9}};
        System.out.println(q.diagonalSum(mat));
    }
}
