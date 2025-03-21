package Patterns;

import java.util.Scanner;

public class HollowRect {
    public static void main(String[] args) {
            hollow(4,5);
    }
    public static void hollow(int totRows,int totCols){
        //outer loops
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols ; j++) {
                if(i==1 || i == totRows || j==1 || j==totCols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
