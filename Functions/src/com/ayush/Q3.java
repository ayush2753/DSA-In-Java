package com.ayush;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isEligible(n));
    }
    static boolean isEligible(int n){
        if(n>=18){
            return true;
        }
        return false;
    }
}
