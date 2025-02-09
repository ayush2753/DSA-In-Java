package com.ayush;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

       /* if(fruit.equals("a pple")){
            System.out.println("a sweet red fruit");
        }
        if(fruit.equals("mango")){
            System.out.println("king of fruit");
        }*/

        /*
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grape" -> System.out.println("small fruit");
            default -> System.out.println("please enter a valid fruit");
        }
        */
        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grape":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
                break;
        }
    }
}