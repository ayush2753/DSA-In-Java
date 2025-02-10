package com.ayush;

import java.sql.SQLOutput;
import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1:");
        int a = in.nextInt();
        System.out.println("enter number 2:");
        int b = in.nextInt();
        System.out.println(CheckSum(a,b));
    }
    static int CheckSum(int a,int b){
         int sum = a+b;
         return sum;
    }
}
