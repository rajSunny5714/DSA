package arrays.array2D;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            arr[i] = new int[m];

            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array");
        for(int i=0; i<n; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// -----------------------------Example of jagged array-----------------------------
//     size rows       3
//     size column     4
//                      1 2 3 4
//     size column   6
//                   1 2 3 4 5 6
//     size column   2
//                   1 2
//      Jagged Array
//        1 2 3 4
//        1 2 3 4 5 6
//        1 2
