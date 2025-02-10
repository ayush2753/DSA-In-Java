package com.ayush;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Q6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int r= in.nextInt();
        System.out.println(Area(r));
        System.out.println(Circumference(r));
    }
    static int Area(int r){
        int area = (int) (3.14 * r * r);
        return area;
    }
    static int Circumference(int r){
        int circum= (int) (2 * 3.14 * r);
        return circum;
    }
}
