package com.company;

public class Even_Number_Of_Digits {
    public int findNumbers(int[] nums) {
       if(nums.length==0){
           return 0;
       }
       int count = 0;
       for(int x:nums){
               String s =  Integer.toString(x);
               if(s.length() % 2 == 0){
               count++;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        /*
        Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
                Therefore, only 12 and 7896 contain an even number of digits.
         */
        Even_Number_Of_Digits e =  new Even_Number_Of_Digits();
        System.out.println(e.findNumbers(new int[]{11,22,33,442}));
    }
}
