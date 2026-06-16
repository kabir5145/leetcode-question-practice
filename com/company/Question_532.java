package com.company;

import java.util.Arrays;

public class Question_532 {
    public int findPairs(int[] nums, int k) {
        /*
        Time:  O(n log n)
        Space: O(1)
         */
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        if (k == 0) {
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    ans++;
                    while (i < n - 1 && nums[i] == nums[i + 1]) i++;
                }
            }
            return ans;
        }
        int i = 0;
        int j = 1;

        while (j < n){
            int diff = nums[j] - nums[i];

            if (diff == k){
                ans++;

                //Skip the duplicates
                while(i < j && nums[i] == nums[i+1])i++;
                while(j < n - 1 && nums[j] == nums[j+1])j++;
                i++;
                j++;
            }else if (diff < k){
                j++;
            }else{
                i++;
                if(i == j)j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        K-diff Pairs in an Array
        Question_532 q = new Question_532();
        System.out.println(q.findPairs(new int[]{3,1,4,1,5}, 2));
    }
}
