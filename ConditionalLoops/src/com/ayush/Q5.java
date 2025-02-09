package com.ayush;

import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class Q5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();

        int max=a;

        if(b>a){
            max= b;
        }
        else {
            max= a;
        }
        System.out.println("the maximum is "+max);
    }
}
