package ayush;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {3,5,12,45};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr)
    {
        arr[0] = 99;
    }
}
