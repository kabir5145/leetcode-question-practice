package com.company;

import java.util.Arrays;

public class Question_832 {
    public int[][] flipAndInvertImage(int[][] image) {
        /*
        Time Complexity:O(n × m)
        Space Complexity:O(1) (in-place)
        */

        int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = image[i].length - 1;

            while (left <= right) {
                // Flip + Invert together
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }

        return image;
    }

    public static void main(String[] args) {
//        Flipping an Image
        Question_832 q = new Question_832();
        int[][] image = new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {1, 1, 0},
        };
        System.out.println(Arrays.deepToString(q.flipAndInvertImage(image)));
    }
}
