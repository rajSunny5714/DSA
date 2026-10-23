package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] nums = new int[s];
        System.out.println("Enter array elements:");
        for(int i=0; i<s; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Output: "+sortPermutation(nums));
    }
    public static int sortPermutation(int[] nums) {
        int k = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=i) {
                k &= nums[i];
            }
        }
        return k == -1 ? 0 : k;
    }
}
