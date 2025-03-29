package Leetcode;

public class CountSubArraySum {
    public static void main(String[] args) {
         int arr[]= {1,2,3,-3,1,1,1,4,2,-3};
         int k=3;
         int cnt = subarraySum(arr,k);
         System.out.println(cnt);
    }
    public static int subarraySum(int[] nums, int k) {
        int n =nums.length;
        int cnt=0;

        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum += nums[j];

                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
