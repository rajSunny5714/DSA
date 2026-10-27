package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter number of columns:");
        int n = sc.nextInt();

        String[] grid = createGrid(m, n);

        System.out.println("Generated Grid:");
        for(String row : grid) {
            System.out.print(row+" ");
        }
    }
    public static String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        for(int i=0; i<m; i++) {
            char[] row = new char[n];
            for(int j=0; j<n; j++) {
                row[j] = '#';
            }
            grid[i] = new String(row);
        }
        char[] firstRow = new char[n];
        for(int j=0; j<n; j++) {
            firstRow[j] = '.';
        }
        grid[0] = new String(firstRow);
        for(int i=1; i<m; i++) {
            char[] row = grid[i].toCharArray();
            row[n - 1] = '.';
            grid[i] = new String(row);
        }
        return grid;
    }
}
