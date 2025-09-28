package com.company;

import java.util.Scanner;

public class array_question {
    public static void main(String[] args) {
        //Question 1 : Two Sum.
        // Given an array of integers nums and an integer target,
        // return indices of the two numbers such that they add up to target.
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,3,5};
        int num = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
           for(int k = 0;k<arr.length;k++){
               if(num== arr[i]+arr[k]){
                   System.out.println("["+arr[i]+","+arr[k]+"]");
               }
           }
        }
    }
}
