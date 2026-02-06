package com.company;

public class Question_541 {
    public String reverseStr(String s, int k) {
/*
        Time:  O(n)
        Space: O(n)   // because of toCharArray()
 */
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            // reverse first k characters in this block
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }
    public static void main(String[] args) {
//        Reverse String II
        Question_541 q = new Question_541();
        System.out.println(q.reverseStr("abcdefg", 3));
    }
}
