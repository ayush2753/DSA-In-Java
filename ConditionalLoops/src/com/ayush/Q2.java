package com.ayush;

import java.util.Scanner;
//Take name as input and print a greeting message for that particular name.
public class Q2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String name = Input.next();

        System.out.println("hello " +name +" how can i help you");
    }
}
