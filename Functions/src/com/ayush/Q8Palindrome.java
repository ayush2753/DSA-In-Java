package com.ayush;

import java.util.Scanner;
//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Q8Palindrome  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isPalindrome(n)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
    static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n != 0){
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }
        return (reverse == original);
    }
}
