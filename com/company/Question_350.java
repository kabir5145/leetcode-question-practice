package com.company;

import java.util.*;

public class Question_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*
        Time Complexity : O(n log n + m log m)
        Space Complexity : O(min(n, m))
         */
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> set = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
               set.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                i++;
            }
        }
        //Convert list to array
        int [] ans = new int [set.size()];
        int k = 0;
        for (Integer integer : set) {
            ans[k++] = integer;
        }
        return ans;
    }
    public static void main(String[] args) {
//        Intersection of Two Arrays II
        Question_350 s = new Question_350();
        int[] arr = {1,2,3,3,6};
        int[] arr2 = {9,8,3,3,5};
        System.out.println(Arrays.toString(s.intersect(arr, arr2)));
    }
}
