package com.ayush;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //print number 1 to 5
        /*
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }*/

        //print number 1 to n
        /*Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }*/

        //while loop
        int num=1;
        while(num <= 5){
            System.out.println(num);
            num+=1;
        }
    }
}
