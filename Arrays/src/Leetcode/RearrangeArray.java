package Leetcode;

import java.util.ArrayList;

public class RearrangeArray {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[] = Rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] Rearrange(int[] arr, int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else {
                neg.add(arr[i]);
            }
        }

        for (int i = 0; i < n/2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i + 1] = neg.get(i);
        }
        return arr;
    }

}
