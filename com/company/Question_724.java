package com.company;

public class Question_724 {
    public int pivotIndex(int[] nums) {
        /*
        Time : O(n)
        Space : O(1)
         */
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum)return i;
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
//        Find Pivot Index
        Question_724 q = new Question_724();
        System.out.println(q.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
