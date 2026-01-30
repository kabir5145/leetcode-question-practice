package com.company;

public class Question_278 {
/*
    Time: O(log n)
    Space: O(1)
 */
    //  simulate first bad version
    static int BAD = 4;

    // LeetCode API simulation
    static boolean isBadVersion(int version) {
        return version >= BAD;
    }

    // Your binary search solution
    public static int firstBadVersion(int n) {
        int low = 1, high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
//        First Bad Version
        int n = 10;
        System.out.println(firstBadVersion(n));

    }
}
