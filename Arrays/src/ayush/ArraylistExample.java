package ayush;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        
        /*list.add(17);
        list.add(67);
        list.add(7);
        list.add(799);
        System.out.println(list.contains(7));
        list.set(0,99);
        System.out.println(list);*/
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
