package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Minimum moves: "+minMoves(nums));
    }
    public static int minMoves(int[] nums) {
        int mx = nums[0];
        int mvs = 0;
        for(int i=1; i<nums.length; i++) {
            mx = Math.max(mx, nums[i]);
        }
        for(int num : nums) {
            mvs += mx-num;
        }
        return mvs;
    }
}