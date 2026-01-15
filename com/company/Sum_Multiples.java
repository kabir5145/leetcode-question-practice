package com.company;

public class Sum_Multiples {
    public int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if( i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        //Time complexity : O(N)

        Sum_Multiples s = new Sum_Multiples();
        System.out.println(s.sumOfMultiples(10));
        System.out.println(s.sumOfMultiples(100));
    }
}
