package com.company;

public class Question_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*
        Time Complexity: O(n + m)
        Space Complexity: O(n + m) (because of merged array)
        */
        int len1 = nums1.length;
        int len2 = nums2.length;
        int [] result = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < len1) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from arr2
        while (j < len2) {
            result[k++] = nums2[j++];
        }

        int n = result.length;

        if (n % 2 == 1) {
            return result[n / 2];
        } else {
            return (result[n/2 - 1] + result[n/2]) / 2.0;
        }
    }
    public static void main(String[] args) {
//        Median of Two Sorted Arrays
        Question_4 q = new Question_4();
        int[] num_1 = new int[] { 1, 3 };
        int[] num_2 = new int[] { 2 };
        System.out.println(q.findMedianSortedArrays(num_1, num_2));

    }
}
