package com.company;

public class Sum_Of_Squares_Of_Unique_Elements {
    public int sumOfSquares(int[] nums) {
        int n  = nums.length;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if( n% (i+1)==0){
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
/*
        Time: O(n)
        Space: O(1)
 */
        Sum_Of_Squares_Of_Unique_Elements obj = new Sum_Of_Squares_Of_Unique_Elements();
        System.out.println(obj.sumOfSquares(new int[]{1,2,3,4}));

    }
}
