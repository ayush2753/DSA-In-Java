package com.ayush;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Q9 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        num1 = in.nextInt();
        System.out.println("Enter the second number ::");
        num2 = in.nextInt();

        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;

            check = i;

            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }

            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
        }
    }
}
