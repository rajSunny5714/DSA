package Top_150_DSA;

import java.util.Scanner;

public class RemoveElement_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int k = removeElement(arr, t);
        System.out.println("k = " + k);
        System.out.print("Modified Array: ");
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