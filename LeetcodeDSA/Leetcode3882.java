package LeetcodeDSA;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode3882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter grid elements:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Minimum XOR Path: "+minCost(arr));
    }
    public static int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Set<Integer>[][] dp = new HashSet[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                dp[i][j] = new HashSet<>();
                if(i==0 && j==0) {
                    dp[i][j].add(grid[i][j]);
                } else {
                    if(i>0) {
                        for(int x : dp[i-1][j]) {
                            dp[i][j].add(x ^ grid[i][j]);
                        }
                    }
                    if(j>0) {
                        for(int x : dp[i][j-1]) {
                            dp[i][j].add(x ^ grid[i][j]);
                        }
                    }
                }
            }
        }
        return Collections.min(dp[m-1][n-1]);
    }
}
