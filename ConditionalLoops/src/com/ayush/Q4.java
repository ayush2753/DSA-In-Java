package com.ayush;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        System.out.println("enter the operator");
        char op = in.next().trim().charAt(0);
        if(op == '+' || op== '-' || op == '*' || op== '/')
            System.out.println("enter 2 number");
            int a = in.nextInt();
            int b = in.nextInt();
        {
            if(op == '+'){
                ans =a+b;
            }
            if(op == '-'){
                ans =a-b;
            }
            if(op == '*'){
                ans =a*b;
            }
            if(op == '/'){
                ans =a/b;
            }
        }
        System.out.println("the value is " +ans);

    }
}
