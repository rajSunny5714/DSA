package arrays.leetcodeArray;

import java.util.Scanner;

public class ArrayPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = buildArray(nums);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    private static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
