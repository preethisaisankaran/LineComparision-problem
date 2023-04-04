package com.day5problems;

public class armstrong {
    public static void main(String[] args) {
        int n = 155;
        int temp = n;
        int sum = 0, r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("It is armstrong number");
        } else
            System.out.println("It is armstrong number");

    }
}
