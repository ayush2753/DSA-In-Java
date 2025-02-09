package com.ayush;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Ayush Saxena");
            case 2 -> System.out.println("boi");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("enter correct empID");
        }

    }
}
