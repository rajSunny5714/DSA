package leetcodeDSA;

import java.util.Scanner;

public class PascalsTriangles {
    public static long nCr(int n, int r) {
        long res = 1;
        for(int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static void nthRow(int n) {
        long ans = 1;
        System.out.print(ans + " ");

        for(int col = 1; col < n; col++) {
            ans = ans * (n - col);
            ans = ans / col;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void pascalTriangle(int n) {
        for(int row = 1; row <= n; row++) {
            long ans = 1;

            for (int col = 1; col <= row; col++) {
                System.out.print(ans + " ");
                ans = ans * (row - col);
                ans = ans / col;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Element at position (" + r + ", " + c + "): "+ nCr(r - 1, c - 1));
        System.out.print("N-th row of Pascal's triangle: ");
        nthRow(N);
        System.out.println("First n rows of Pascal's triangle:");
        pascalTriangle(N);
    }
}