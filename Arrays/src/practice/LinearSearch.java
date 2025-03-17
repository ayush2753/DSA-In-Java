package practice;

public class LinearSearch {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key= 1;
        int index = linearSearch(numbers,key);
        if (index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index : " + index);
        }
    }
    public static int linearSearch(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}
