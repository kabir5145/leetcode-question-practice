package com.company;

public class Question_209 {
    public int minSubArrayLen(int target, int[] nums) {
        /*
        Time : O(n)
        Space : O(1)
         */
        /*
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
         */
        int n = nums.length;
        int low = 0;
        int high = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        while (high < n){
            sum += nums[high];
            while (sum >= target){
                ans = Math.min(ans,high-low+1);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
    public static void main(String[] args) {
//        Minimum Size Subarray Sum
        Question_209 q = new Question_209();
        System.out.println(q.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}
