package com.ayush;

import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt() ;
        int count =0;
        while (n>0){
            int rem = n%10;
            if(rem == i){
                count++;
            }
            n= n / 10 ;
        }
        System.out.println(count);

    }
}
