package com.ayush;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n % 2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
