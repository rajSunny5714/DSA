package arrays.arrayGFG;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int arr[]) {
        int n = arr.length + 1;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num : arr) {
            actualSum += num;
        }
        return expectedSum-actualSum;
    }
}
