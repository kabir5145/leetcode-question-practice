package com.company;

import java.util.Scanner;

public class Add_Two_Integers {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add_Two_Integers a = new Add_Two_Integers();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(a.sum(num1,num2));
    }
}
