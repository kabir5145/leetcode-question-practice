package com.company;

public class Question_1588 {
    /*
    Time — O(n²)
    Space — O(n)
     */
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;

        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        int total = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int length = end - start + 1;
                if (length % 2 == 1) {
                    total += prefixSum[end + 1] - prefixSum[start];
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
//        Sum of All Odd Length Subarrays
        Question_1588 q = new Question_1588();
        System.out.println(q.sumOddLengthSubarrays(new int[]{1,2,3,4,5}));
    }
}
