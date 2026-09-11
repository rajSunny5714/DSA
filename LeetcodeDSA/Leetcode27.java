package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:  ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter elements of the array:");
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int t = sc.nextInt();

        int k = removeElement(arr, t);
        System.out.println("Output Length: "+k);

        System.out.print("Array after removing target: ");
        for(int i=0; i<k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i]!=val) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
