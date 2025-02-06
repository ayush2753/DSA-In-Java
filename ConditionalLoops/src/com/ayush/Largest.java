package com.ayush;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //FIND LARGEST OF THE THREE NUMBER
        /*
        int max= a;
        if(b>max){
            max=b;
        }
         else if (c>max) {
            max=c;
        }
        System.out.println("the largest number is " + max);
        */

        int max = Math.max(c , Math.max(a,b));
        System.out.println(max);
    }
}
