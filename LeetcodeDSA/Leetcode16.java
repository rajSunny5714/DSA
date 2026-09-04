package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode16 {
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
        System.out.println("Output: "+threeSumClosest(arr, t));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }
                if(sum < target) {
                    left++;
                } else if(sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return closest;
    }
}
