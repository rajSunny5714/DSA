package Top_75_DSA;

import java.util.Scanner;

public class Leetcode136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] nums = new int[s];
        System.out.println("Enter array elements:");
        for(int i=0; i<s; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Output: "+singleNumber(nums));
    }

//    ----------- Solution ----------------
    public static int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int cnt = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if(cnt==1) {
                return nums[i];
            }
        }
        return -1;
    }
}
