package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode2091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Output: "+minimumDeletions(arr));
    }
    public static int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for(int i=1; i<n; i++) {
            if(nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if(nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int front = right + 1;
        int back = n - left;
        int bothSides = (left + 1) + (n - right);

        return Math.min(front, Math.min(back, bothSides));
    }
}
