package com.company;

public class Question_11 {
    public int maxArea(int[] height) {
/*
        Time: O(n)
        Space: O(1)
 */

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            max = Math.max(max, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
//        Container With Most Water
        Question_11 q = new Question_11();
        System.out.println(q.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
