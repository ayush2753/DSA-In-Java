package com.ayush;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =0 ;
        int b= 1;
        int n = in.nextInt();

        for (int i = 2; i <= n ; i++) {
            int temp = b;
            b= b+a;
            a = temp;
        }
        System.out.println(" the series number is " +b);

    }
}
