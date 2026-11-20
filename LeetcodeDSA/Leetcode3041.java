package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode3041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Output: "+maxSelectedElements(nums));
    }
    public static int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[1000003];
        int ans = 0;
        for(int num : nums) {
            dp[num + 1] = Math.max(dp[num + 1], dp[num]+1);
            dp[num] = Math.max(dp[num], dp[num - 1]+1);
            ans = Math.max(ans, Math.max(dp[num], dp[num+1]));
        }
        return ans;
    }
}
