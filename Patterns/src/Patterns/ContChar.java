package Patterns;

import java.util.Scanner;

public class ContChar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = obj.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
