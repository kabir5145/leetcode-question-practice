package com.company;

public class Single_Number {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            ans ^= x;
        }
        return ans;
}
    public static void main(String[] args) {
        Single_Number s = new Single_Number();
        int[] num = new int[]{1,1,1,5,4,4,4};
        System.out.println(s.singleNumber(num));
    }
}
