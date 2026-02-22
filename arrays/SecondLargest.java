package arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num>max) {
                secondMax = max;
                max = num;
            } else if(num>secondMax && num!=max) {
                secondMax = num;
            }
        }
        System.out.println("Second Largest = "+secondMax);
    }
}
