package com.company;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        return (int) Math.sqrt(x);
    }
    public static void main(String[] args) {
        Sqrt s = new Sqrt();
        System.out.println(s.mySqrt(4));
    }
}
