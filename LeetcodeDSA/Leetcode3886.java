package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] nums = new int[s];
        System.out.println("Enter array elements:");
        for(int i=0; i<s; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Output: "+sortableIntegers(nums));
    }
    public static int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int k = 1; k <= n; k++) {
            if(n % k != 0)
                continue;
            boolean valid = true;
            int prev = Integer.MIN_VALUE;
            for(int i = 0; i < n; i += k) {
                int drops = 0;
                int dropIndex = -1;
                for(int j = 0; j < k; j++) {
                    int curr = nums[i + j];
                    int next = nums[i + (j + 1) % k];
                    if(curr > next) {
                        drops++;
                        dropIndex = j;
                    }
                }
                if(drops > 1) {
                    valid = false;
                    break;
                }
                int start = (dropIndex + 1) % k;
                for(int j = 0; j < k; j++) {
                    int curr = nums[i + (start + j) % k];
                    if(curr < prev) {
                        valid = false;
                        break;
                    }
                    prev = curr;
                }
                if(!valid) break;
            }
            if(valid) ans += k;
        }
        return ans;
    }
}
