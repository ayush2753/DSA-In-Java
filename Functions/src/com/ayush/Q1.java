package com.ayush;

import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = in.nextInt();
        System.out.println("Enter number 2: ");
        int b = in.nextInt();
        System.out.println("Enter number 3: ");
        int c = in.nextInt();
        System.out.println("the maximum number is: "  +maxNo(a,b,c));
        System.out.println("the minimum number is: " +minNo(a,b,c));
    }
    static int maxNo(int a, int b, int c){
        int max = a;
        if(b>a){
            max =b;
        } else if (c>a) {
            max = c;
        }
        return max;
    }
    static int minNo(int a, int b, int c){
        int min = a;
        if(b<a){
            min =b;
        } else if (c<a) {
            min = c;
        }
        return min;
    }
}
