package LeetcodeDSA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode3718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter elements of the array:");
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int t = sc.nextInt();
        System.out.println("Result: "+missingMultiple(arr, t));
    }
    public static int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int m = k;
        while(set.contains(m)) {
            m += k;
        }
        return m;
    }
}
