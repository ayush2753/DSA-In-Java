package com.ayush;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Product(a,b));
    }
    static int Product(int a,int b){
        int product = a*b;
        return product;
    }
}
