package arrays.array2D;

import java.util.Scanner;

public class RandomNumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print((int)(Math.random()*10)+" "); // multiply by 10 for getting one's digit number
            }
            System.out.println();
        }
    }
}
