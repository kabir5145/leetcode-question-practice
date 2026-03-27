package com.company;

public class Question_1464 {
    public int maxProduct(int[] nums) {
        /*
        Time Complexity: O(n)
        Space Complexity: O(1)
         */
        int max_1 = 0, max_2 = 0;
        for(int num : nums){
            if (num > max_1) {
                max_2 = max_1;
                max_1 = num;
            } else if (num > max_2) {
                max_2 = num;
            }
        }
        return (max_1-1)*(max_2-1);
    }
    public static void main(String[] args) {
//        Maximum Product of Two Elements in an Array
        Question_1464 q = new Question_1464();
        System.out.println(q.maxProduct(new int[]{3,4,5,2}));
        System.out.println(q.maxProduct(new int[]{3,7}));
    }
}
