package Top_75_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==nums[i-1]){
                cnt++;
            } else {
                cnt=1;
            }
            if(cnt>nums.length/2) {
                return nums[i];
            }
        }
        return nums[0];
    }
}
