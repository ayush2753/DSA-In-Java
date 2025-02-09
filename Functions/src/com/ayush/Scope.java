package com.ayush;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //block
        {
            // int a=88; already initialised outside the block whatever is initialised in block remains in block
            a=100;// reassign the value of already created one
            System.out.println(a);
            int c=99; // this will be only for the block assigned
        }
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
