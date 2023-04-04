package com.day5problems;

public class prime {
    public static void main(String[] args) {

        int n = 20;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("prime");

            } else
                System.out.println("not prime");


        }
    }
}
