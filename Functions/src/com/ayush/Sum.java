package com.ayush;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        /*int ans = sum2();
        System.out.println(ans);*/

        int ans = sum3(24,13);
        System.out.println(ans);
    }

    static int sum3(int a,int b){
        int sum= a+b;
        return sum;

    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("the sum is " +sum);
    }
}
