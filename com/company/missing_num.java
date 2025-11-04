package com.company;

public class missing_num {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        missing_num m = new missing_num();
        int nums[]={1,2,3,4,5,6,7,8,0};
        System.out.println(m.missingNumber(nums));
    }
}
