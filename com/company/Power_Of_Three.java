package com.company;

public class Power_Of_Three {
    public boolean isPowerOfThree(int n) {
        return ( n>0 &&  1162261467%n==0);
    }
    public static void main(String[] args) {
        //Power of Three
        Power_Of_Three p = new Power_Of_Three();
        System.out.println(p.isPowerOfThree(45));
    }
}
