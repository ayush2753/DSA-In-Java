package com.ayush;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r;
        int sum=0;

        int temp=n;
        while(n>0){
            r= n%10;
            sum= (sum*10)+r;
            n=n/10;

        }

        if(temp==sum){
            System.out.println("the number is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
