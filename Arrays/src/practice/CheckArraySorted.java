package practice;

import java.util.Scanner;
//Linear Search
public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = obj.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the array");
        //input
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        //output
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        System.out.println("Enter the number to be searched: ");
        int num = obj.nextInt();
        int pos = find(arr,num,n);
        if(pos == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("found at index: " +pos);
        }
    }


    public static int find(int v[],int num,int n){
        for (int i = 0; i < n; i++) {
            if(v[i] == num){
                return i; //found
            }
        }
        return -1; //not found
    }

}
