package com.company;

public class Question_643_Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        /*
        Time complexity : O(n)
        Space complexity : O(1)
         */
        int n = nums.length;
        int low = 0;
        int high = k-1;
        int sum = 0;

        for(int i = low ;i <= high;i++){
            sum += nums[i];
        }

        double res = sum;

        while (high < n - 1) {
            sum -= nums[low];
            low++;
            high++;
            sum += nums[high];
            res = Math.max(res, sum);
        }
        return (double) res/k;
    }
    public static void main(String[] args) {
//        Maximum Average Subarray I
        Question_643_Maximum_Average_Subarray_I obj = new Question_643_Maximum_Average_Subarray_I();
        System.out.println(obj.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
