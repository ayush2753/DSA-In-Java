package Patterns;

public class InvertedHalfNumber {
    public static void main(String[] args) {
        halfinvertedNum(5);
    }
    public static void halfinvertedNum(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
