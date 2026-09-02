package arrays.arrayGFG;

import java.util.Scanner;

public class ReplaceWithAdjacentMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        updateArray(arr);
        System.out.print("output: ");
        for(int x : arr) {
            System.out.print(x+" ");
        }
    }
    private static void updateArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for(int i=0; i<n; i++) {
            int prev = (i==0) ? 1 : arr[i-1];
            int next = (i==n-1) ? 1 : arr[i+1];
            temp[i] = prev * arr[i] * next;
        }
        for(int i=0; i<n; i++) {
            arr[i] = temp[i];
        }
    }
}


// Questions and Logic:
//
//        Input: arr[] = [2, 4, 5]
//        Output: [8, 40, 20]
//        Explanation:
//        For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 4 = 8
//        For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 4 * 5 = 40
//        For index i = 2, arr[2] = arr[1] * arr[2] * 1 = 4 * 5 * 1 = 20
//        Thus, the updated array becomes [8, 40, 20].
//
//        Input: arr[] = [2, 5, 7, 8, 3]
//        Output: [10, 70, 280, 168, 24]
//        Explanation:
//        For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 5 = 10
//        For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 5 * 7 = 70
//        For index i = 2, arr[2] = arr[1] * arr[2] * arr[3] = 5 * 7 * 8 = 280
//        For index i = 3, arr[3] = arr[2] * arr[3] * arr[4] = 7 * 8 * 3 = 168
//        For index i = 4, arr[4] = arr[3] * arr[4] * 1 = 8 * 3 * 1 = 24
//        Thus, the updated array becomes [10, 70, 280, 168, 24].