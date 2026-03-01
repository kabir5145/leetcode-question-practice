package com.company;

import java.util.Arrays;

public class Question_2367 {
    /*
    Time Complexity: O(n³)
    Space Complexity: O(1) (Constant Space)
     */
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                for (int k=j+1; k<nums.length; k++){
                    if(nums[j]-nums[i] == diff && nums[k]-nums[j] == diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        Number of Arithmetic Triplets
        Question_2367 obj = new Question_2367();
        int[] arr = {0,1,4,6,7,10};
        System.out.println(obj.arithmeticTriplets(arr, 3));
    }
}
