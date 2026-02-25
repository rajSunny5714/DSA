package arrays.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Display Matrix: ");
        for(int[] arr1: arr) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
