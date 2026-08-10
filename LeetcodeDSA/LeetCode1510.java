package LeetcodeDSA;

import java.util.Scanner;

public class LeetCode1510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(winnerSquareGame(n));
    }
    public static boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        dp[0] = false;

        for(int i=0; i<=n; i++) {
            for(int j=1; j*j<=i; j++) {
                int sq = j*j;
                if(!dp[i-sq]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
