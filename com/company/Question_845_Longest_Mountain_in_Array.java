package com.company;

public class Question_845_Longest_Mountain_in_Array {
    public int longestMountain(int[] arr) {
        /*
        Time → O(n²) worst case
        Space → O(1)

        Pattern:
        Peak detection + expand left/right
         */
        int n = arr.length;
        int max = 0;

        for (int i = 1; i < n - 1; i++) {

            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {

                int left = i;
                int right = i;

                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
    public static void main(String[] args) {
//        Longest Mountain in Array
        Question_845_Longest_Mountain_in_Array obj = new Question_845_Longest_Mountain_in_Array();
        System.out.println(obj.longestMountain(new int[]{2,1,4,7,3,2,5}));
    }
}
