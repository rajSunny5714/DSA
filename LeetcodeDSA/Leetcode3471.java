package LeetcodeDSA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode3471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter array elements:");
        for(int i=0; i<s; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Value: ");
        int t = sc.nextInt();

        System.out.println("Answer: "+largestInteger(arr, t));
    }
    public static int largestInteger(int[] nums, int k) {
        int[] cnt = new int[51];
        int s = nums.length;
        for(int i=0; i<=s-k; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=i; j < i+k; j++) {
                set.add(nums[j]);
            }
            for(int num : set) {
                cnt[num]++;
            }
        }
        int ans = -1;
        for(int i=0; i<=50; i++) {
            if(cnt[i] == 1) {
                ans = i;
            }
        }
        return ans;
    }
}
