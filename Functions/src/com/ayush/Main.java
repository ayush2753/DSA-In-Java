package com.ayush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           //Q: take an input of 2 number and print the sum
        Scanner in = new Scanner(System.in);

        System.out.print("enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("the sum is " +sum);

    }
}