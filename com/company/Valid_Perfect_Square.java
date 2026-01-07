package com.company;

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;

        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;

        //this method is by using the trick
//        int root = (int) Math.sqrt(num);
//        return root * root == num;
    }
    public static void main(String[] args) {
        Valid_Perfect_Square s = new Valid_Perfect_Square();
        System.out.println(s.isPerfectSquare(5));
        System.out.println(s.isPerfectSquare(25));
        System.out.println(s.isPerfectSquare(4));
    }
}
