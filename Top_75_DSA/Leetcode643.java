package Top_75_DSA;

import java.util.Scanner;

public class Leetcode643 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int t = sc.nextInt();
        System.out.println("Output: "+findMaxAverage(arr, t));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i=k; i<nums.length; i++) {
            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum/k;
    }
}
