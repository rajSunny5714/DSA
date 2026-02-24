package arrays.leetcodeArray;

import java.util.Scanner;

public class RunningSum1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = runningSum(arr);
        for(int i=0; i<n; i++) {
            System.out.print(res[i]+" ");
        }
    }
    private static int[] runningSum(int[] nums) {
        int[] arr1 = new int[nums.length];
        arr1[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            arr1[i] = arr1[i-1] + nums[i];
        }
        return arr1;
    }
}
