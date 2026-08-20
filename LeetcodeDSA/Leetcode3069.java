package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode3069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        String res = Arrays.toString(resultArray(arr));
        System.out.println("Result: "+ res);
    }
    public static int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int i = 0, j = 0;

        arr1[i++] = nums[0];
        arr2[j++] = nums[1];

        for(int k=2; k<n; k++) {
            if(arr1[i-1] > arr2[j-1]) {
                arr1[i++] = nums[k];
            } else {
                arr2[j++] = nums[k];
            }
        }
        int[] res = new int[n];
        int idx = 0;
        for(int k=0; k<i; k++) {
            res[idx++] = arr1[k];
        }
        for(int k=0; k<j; k++) {
            res[idx++] = arr2[k];
        }
        return res;
    }
}
