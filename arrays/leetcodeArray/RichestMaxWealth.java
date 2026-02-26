package arrays.leetcodeArray;

import java.util.Scanner;

public class RichestMaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers (rows): ");
        int m = sc.nextInt();
        System.out.print("Enter number of banks (columns): ");
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        System.out.println("Enter account balances:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int result = maximumWealth(accounts);
        System.out.println("Richest Customer Wealth: " + result);
    }
    private static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++) {
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum>max) {
                max = sum;
            }
        }
        return max;
    }
}