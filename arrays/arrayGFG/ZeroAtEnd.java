package arrays.arrayGFG;

import java.util.*;
public class ZeroAtEnd {
    public static void moveZeros(int arr[]) {
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeros(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
