package com.company;

public class Question_2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        /*
        Time: O(n + m)
        Space: O(1)
         */
        int n  = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Minimum Common Value
        Question_2540 q = new Question_2540();
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {2,3,4,5};
        System.out.println(q.getCommon(nums1,nums2));
    }
}
