package com.company;

public class Divisor_Game {
    public boolean divisorGame(int n) {
        return n%2==0;
    }
    public static void main(String[] args) {
        Divisor_Game d = new Divisor_Game();
        System.out.println(d.divisorGame(1));
        System.out.println(d.divisorGame(2));
    }
}
