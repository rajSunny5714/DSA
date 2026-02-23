package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Elements of Array:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
//        for(int num : arr) {
//            System.out.print(num+" ");
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
