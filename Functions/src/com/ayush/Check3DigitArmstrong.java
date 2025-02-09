package com.ayush;

import java.util.Scanner;

public class Check3DigitArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(isArmstrong(a));

    }

    static boolean isArmstrong(int a){
        int sum=0;
        int original =a;
        while(a>0){
            int rem = a % 10;
            sum += rem*rem*rem;
            a = a/10;
        }
        return sum == original;
    }
}
