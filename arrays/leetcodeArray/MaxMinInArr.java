package arrays.leetcodeArray;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Minimum element: " + arr[0]);
        System.out.println("Maximum element: " + arr[n-1]);
    }
}
