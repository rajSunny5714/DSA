package LeetcodeDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Leetcode2089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] nums = new int[s];
        System.out.println("Enter array elements:");
        for(int i=0; i<s; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        List<Integer> result = targetIndices(nums, target);
        System.out.println("Output: "+result);
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
