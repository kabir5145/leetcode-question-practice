package com.company;

import java.util.Scanner;

public class next_question {
    public  void main(char[] s) {
//        Write a function that reverses a string. The input string is given as an array of characters s.
                if (s == null) return; // optional null check
                int i = 0, j = s.length - 1;
                while (i < j) {
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    i++;
                    j--;
                }
            }
        }
