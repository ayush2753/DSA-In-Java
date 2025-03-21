package Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        Floyd(5);
    }
    public static void Floyd(int n){
        int counter = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
