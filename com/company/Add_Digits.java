package com.company;

public class Add_Digits {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
    public static void main(String[] args) {
        //Add Digits
        Add_Digits a = new Add_Digits();
        System.out.println(a.addDigits(38));
    }
}
