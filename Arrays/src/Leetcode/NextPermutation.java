package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");
    }
    public static List< Integer > nextGreaterPermutation(List< Integer > A){
        int n  = A.size();

        //find breakpoint
        int ind =-1;
        for (int i = n-2; i >=0 ; i--) {
            if(A.get(i) < A.get(i+1)){
                ind=i;
                break;
            }
        }

        //if break point does not exist
        if(ind == -1){
            Collections.reverse(A);
            return A;
        }

        //find the next greatest element and swap it with A[ind]
        for (int i = n-1; i > ind ; i--) {
            if(A.get(i) > A.get(ind)){
                int tmp = A.get(i);
                A.set(i,A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        //reverse the right half
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }
}
