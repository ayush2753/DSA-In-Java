package com.ayush;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        /*fun(23,34,56,677,90,9,121);*/
        multiple(2,5,"Rahul","yAHS");
    }
    static void multiple(int a, int b,String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
