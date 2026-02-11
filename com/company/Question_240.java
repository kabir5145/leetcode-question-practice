package com.company;

public class Question_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        This approach searches the matrix from the top-right corner, eliminating one row or column in each step. It runs in O(m + n) time and uses O(1) extra space.
         */
        int i = 0,j = matrix[0].length-1;

        while(j>=0 && i<matrix.length){
            int mat = matrix[i][j];
            if(mat==target){
                return true;
            }
            else if(mat<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        Search a 2D Matrix II
        Question_240 q = new Question_240();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(q.searchMatrix(matrix, 8));
    }
}
