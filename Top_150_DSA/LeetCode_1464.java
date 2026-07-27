package Top_150_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            res = (nums[n-1]-1)*(nums[n-2]-1);
        }
        return res;
    }
}
