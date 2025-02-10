package com.ayush;

import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(CheckEvenOdd(n));
    }
    static int CheckEvenOdd(int n){
        if(n % 2 == 0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
        return 0;
    }
}
