package arrays;

import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i]= sc.nextInt();
        }
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) {
            arr2[i]= sc.nextInt();
        }
        int[] merged = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++) {
            merged[arr1.length+i] = arr2[i];
        }
        for(int i=0; i<merged.length; i++) {
            System.out.print(merged[i]+" ");
        }
    }
}
