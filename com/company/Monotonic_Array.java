package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Monotonic_Array {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]) inc = false;
            if(nums[i] < nums[i+1]) dec = false;
        }

        return inc || dec;

    }
    public static void main(String[] args) {
        Monotonic_Array m = new Monotonic_Array();
        System.out.println(m.isMonotonic(new int[]{5,2,3,4,5}));
        System.out.println(m.isMonotonic(new int[]{1,2,3,7,5}));
    }
}
