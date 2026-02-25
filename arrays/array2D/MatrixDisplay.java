package arrays.array2D;

import java.util.Scanner;

public class MatrixDisplay {
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
        System.out.println("Matrix Display:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Display with enhanced for loop:");
        for(int[] arr1 : arr) {
            for(int a:arr1) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}