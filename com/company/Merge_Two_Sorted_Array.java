package com.company;

public class Merge_Two_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
                int i = m - 1;
                int j = n - 1;
                int k = m + n - 1;

                // Main merging from back
                while (i >= 0 && j >= 0) {
                    if (nums1[i] > nums2[j]) {
                        nums1[k--] = nums1[i--];
                    } else {
                        nums1[k--] = nums2[j--];
                    }
                }

                // Copy remaining nums2 elements (missing in your code)
                while (j >= 0) {
                    nums1[k--] = nums2[j--];
                }
            }
    public static void main(String[] args) {
        //Merge Sorted Array
        Merge_Two_Sorted_Array obj = new Merge_Two_Sorted_Array();
        obj.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
