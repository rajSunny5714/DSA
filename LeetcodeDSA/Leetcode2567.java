package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode2567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Output: "+minimizeSum(nums));
    }
    public static int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n-1] - nums[2];
        int b = nums[n-2] - nums[1];
        int c = nums[n-3] - nums[0];
        return Math.min(a, Math.min(b, c));
    }
}
