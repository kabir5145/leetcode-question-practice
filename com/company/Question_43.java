package com.company;

import java.math.BigInteger;

public class Question_43 {
    public String multiply(String num1, String num2) {
        /*
        Space Complexity:O(n + m)
        Time Complexity:O(n × m)
         */
        BigInteger bi1 = new BigInteger(num1),bi2 = new BigInteger(num2);
        BigInteger product = bi1.multiply(bi2);
        return product.toString();
    }
    public static void main(String[] args) {
//        Multiply Strings
        Question_43 p = new Question_43();
        System.out.println(p.multiply("3", "2"));
    }
}
