package ayush;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //arrays of primitive
        int [] arr = new int[5];
        arr[0] =23;
        arr[1] =2;
        arr[2] =12;
        arr[3] =20;
        arr[4] =11;
        //[23,45,233,543,2]
        //System.out.println(arr[3]);
        //input for loop
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));*/

        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        /* for each loop
        for (int j : arr) { for every element in array, print the element
            System.out.print(j + " ");
        }*/

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
