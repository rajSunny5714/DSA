package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode_2996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(missingInteger(nums));
    }
    public static int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]+1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        while(true) {
            boolean found = false;
            for(int num : nums) {
                if(num == sum) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return sum;
            }
            sum++;
        }
    }
}
