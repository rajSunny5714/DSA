package Top_150_DSA;

import java.util.Scanner;

public class RotateArray_189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        RotateArray_189 obj = new RotateArray_189();
        obj.rotate(arr, k);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            ans[(i + k) % n] = nums[i];
        }
        for(int i=0; i<n; i++) {
            nums[i] = ans[i];
        }
    }
}
