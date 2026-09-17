package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode1477 {
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
        System.out.println("Output: "+minSumOfLengths(arr, t));
    }
    public static int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int r=0; r<n; r++) {
            sum += arr[r];
            while(sum > target) {
                sum -= arr[left];
                left++;
            }
            if(sum == target) {
                int len = r - left + 1;
                if(left>0 && best[left-1]!=Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + best[left-1]);
                }
                minLen = Math.min(minLen, len);
            }
            best[r] = minLen;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
