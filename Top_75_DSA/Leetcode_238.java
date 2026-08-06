package Top_75_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = 1;
        for(int i=1; i<n; i++) {
            arr[i] = arr[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i=n-1; i>=0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}
