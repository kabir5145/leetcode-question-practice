package com.company;

import java.util.Arrays;

public class Question_414 {
    public int thirdMax(int[] nums) {
        /*
        Time Complexity = O(n)
        Space Complexity = O(1) (constant space)
         */
        Arrays.sort(nums);
        long first_max = Long.MIN_VALUE, second_max = Long.MIN_VALUE,third_max = Long.MIN_VALUE;

        for(int num : nums){
            if(num == first_max || num == second_max || num == third_max){
                continue;
            }
            if((long) num > first_max){
                third_max = second_max;
                second_max = first_max;
                first_max = num;
            }else if((long) num >second_max){
                third_max = second_max;
                second_max = num;
            }else if((long) num >third_max){
                third_max = num;
            }
        }
        if(third_max == Long.MIN_VALUE){
            return (int) first_max;
        }
        return (int)third_max;
    }
    public static void main(String[] args) {
//        Third Maximum Number
        Question_414 q = new Question_414();
        int[] arr = {1,2};
        System.out.println(q.thirdMax(arr));
    }
}
