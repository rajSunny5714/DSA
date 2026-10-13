package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode3727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Output: "+maxAlternatingSum(arr));
    }
    public static long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];
        for(int i=0; i<nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(squares);
        long sum = 0;
        for(int i=0; i<squares.length; i++) {
            if(i < squares.length/2) {
                sum -= squares[i];
            } else {
                sum += squares[i];
            }
        }
        return sum;
    }
}
