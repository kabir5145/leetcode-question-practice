package com.company;

public class plus_one {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        plus_one p = new plus_one();
        int[] arr = {1, 3, 2};
        int[] result = p.plusOne(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

