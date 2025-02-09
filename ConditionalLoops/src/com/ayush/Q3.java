package com.ayush;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p = in.nextFloat();
        float r = in.nextFloat();
        float t = in.nextFloat();
        float si = (p * r * t)/100;

        System.out.println("the simple interest is " +si);
    }
}
