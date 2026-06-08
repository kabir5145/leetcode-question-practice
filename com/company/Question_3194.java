package com.company;

import java.util.Arrays;
/*
If nums is sorted,
then the elements of averages are
(nums[i] + nums[n - i - 1]) / 2 for all i < n / 2.
 */
public class Question_3194 {
    public double minimumAverage(int[] nums) {
        /*
        Time Complexity: O(n log n)
        Space Complexity: O(1)
         */
        Arrays.sort(nums);
        int n = nums.length;
        int j = n - 1;
        double minAvg = Integer.MAX_VALUE;

        for (int i = 0; i < n / 2; i++) {
            double avg = (nums[i] +  nums[j]) / 2.0;
            minAvg = Math.min(minAvg, avg);
            j--;
        }
        return minAvg;
    }
    public static void main(String[] args) {
//        Minimum Average of Smallest and Largest Elements
        Question_3194 q = new Question_3194();
        System.out.println(q.minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
    }
}
