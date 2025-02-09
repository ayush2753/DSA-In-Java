package com.ayush;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in rs");
        int amt = in.nextInt();

        float convert = (float) (amt / 87.80);


        System.out.println("the amount in usd is " +convert);
    }
}
