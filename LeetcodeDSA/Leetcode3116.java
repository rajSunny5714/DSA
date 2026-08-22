package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of elements: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter elements of array:");
        for(int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        System.out.println("Result: "+findKthSmallest(arr, k));
    }
    public static long findKthSmallest(int[] coins, int k) {
        long left = 1;
        int minCoin = Integer.MAX_VALUE;
        for(int c : coins) {
            minCoin = Math.min(minCoin, c);
        }
        long right = (long) minCoin * k;
        while(left < right) {
            long mid = left + (right - left) / 2;
            if(count(mid, coins) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private static long count(long limit, int[] coins) {
        int n = coins.length;
        long total = 0;
        for(int mask=1; mask<(1 << n); mask++) {
            long lcm = 1;
            boolean overflow = false;
            int bits = 0;
            for(int i=0; i<n; i++) {
                if((mask & (1 << i)) != 0) {
                    bits++;
                    lcm = lcm(lcm, coins[i]);
                    if(lcm > limit) {
                        overflow = true;
                        break;
                    }
                }
            }
            if(overflow) continue;
            long cnt = limit / lcm;
            if((bits & 1) == 1)
                total += cnt;
            else
                total -= cnt;
        }
        return total;
    }
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
