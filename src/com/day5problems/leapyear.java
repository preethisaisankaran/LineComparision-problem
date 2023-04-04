package com.day5problems;

public class leapyear {
    public static void main(String[] args) {
        int num = 2039;
        if (num % 100 == 0 && num % 400 == 0 || num % 100 != 0 && num % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("non-leap year");
        }
    }
}

