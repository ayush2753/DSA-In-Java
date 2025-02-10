package com.ayush;

import java.util.Scanner;
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class Q7Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
