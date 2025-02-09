package com.ayush;

public class Shadowing {
    static int x =99;// this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//99
        int x=40;
        System.out.println(x);//40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
