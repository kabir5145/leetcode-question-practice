package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Insertion_Of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {

//        Time: O(n + m)
//        Space: O(n + m)

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for (int num : nums1) set.add(num);
        for (int num : nums2) set1.add(num);

        // store common elements
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : set) {
            if (set1.contains(x)) {
                list.add(x);
            }
        }

        // convert list to array
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {

        //Intersection of Two Arrays

        Insertion_Of_Two_Arrays obj = new Insertion_Of_Two_Arrays();
        System.out.println(Arrays.toString(obj.intersection(new int[]{1, 2, 2, 4, 5}, new int[]{6, 2, 2, 9, 8})));
    }
}
