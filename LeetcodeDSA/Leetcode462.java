package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode462 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Output: "+minMoves2(arr));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med = nums[nums.length/2];
        int mv = 0;
        for(int num : nums) {
            mv += Math.abs(num-med);
        }
        return mv;
    }
}
