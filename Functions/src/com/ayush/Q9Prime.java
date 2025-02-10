package com.ayush;

import java.util.Scanner;

public class Q9Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number:");
        int m = in.nextInt();
        System.out.println("enter second number:");
        int n = in.nextInt();
        int[] ans = PrimeRange(m,n);

        for(int i : ans)
            System.out.println(i + " ");
    }
    static boolean isPrime(int n){
       if( n <= 1 )
           return false;
       for (int i = 2; i < n; i++) {
               if(n % i == 0)
                   return false;

           }
           return true;
    }
    static int[] PrimeRange(int m, int n){
        // temp arr to store prime number
        int[] temp = new int [n-m+1];
        int index=0;

        for (int i = m; i <= n; i++) {
            if(isPrime(i)){
                temp[index++] = i;
            }

        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0 , index);

        return result;
    }
}
