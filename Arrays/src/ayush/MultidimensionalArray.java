package ayush;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MultidimensionalArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        // int [][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
       /* int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };*/
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        //input
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = in.nextInt();
            }
        }

        //output
       /* for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }*/
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
