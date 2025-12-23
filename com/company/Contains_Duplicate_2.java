package com.company;

public class Contains_Duplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int  a = nums.length;
        for(int i = 0; i < a; i++) {
            for(int j = i + 1; j < a; j++) {
                if(nums[i] == nums[j] && Math.abs( i - j ) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Contains Duplicate II
        Contains_Duplicate_2 obj = new Contains_Duplicate_2();
        int arr[] = {1,2,3,1,2,3};
        System.out.println(obj.containsNearbyDuplicate(arr, 2));
    }
}
