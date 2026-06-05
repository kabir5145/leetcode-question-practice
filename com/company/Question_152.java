package com.company;

public class Question_152 {
    public int maxProduct(int[] nums) {
        /*
        Time: O(n)
        Space: O(1)
         */
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<0){
                int temp = nums[i];
                nums[i] = min;
                min = temp;
            }
            max = Math.max(nums[i],nums[i]*max);
            min = Math.min(nums[i],nums[i]*min);

            ans = Math.max(ans,max);
        }
        return ans;
    }
    public static void main(String[] args) {
//        Maximum Product Subarray
        Question_152 q = new Question_152();
        int[] arr = {2,3,-2,4};
        System.out.println(q.maxProduct(arr));
    }
}
