package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;
public class Leetcode3505 {
    static class Fenwick {
        int n;
        long[] count, sum;
        Fenwick(int n) {
            this.n = n;
            count = new long[n + 1];
            sum = new long[n + 1];
        }
        void add(int index, int c, long s) {
            while(index <= n) {
                count[index] += c;
                sum[index] += s;
                index += index & -index;
            }
        }
        long queryCount(int index) {
            long result = 0;
            while(index > 0) {
                result += count[index];
                index -= index & -index;
            }
            return result;
        }
        long querySum(int index) {
            long result = 0;
            while(index > 0) {
                result += sum[index];
                index -= index & -index;
            }
            return result;
        }
        int findKth(int k) {
            int index = 0;
            int bit = Integer.highestOneBit(n);
            for(; bit > 0; bit >>= 1) {
                int next = index + bit;
                if(next <= n && count[next] < k) {
                    index = next;
                    k -= count[next];
                }
            }
            return index + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter subarray size (x): ");
        int x = sc.nextInt();
        System.out.print("Enter number of subarrays (k): ");
        int k = sc.nextInt();
        long result = minOperations(nums, x, k);
        System.out.println("Minimum operations required: "+result);
        sc.close();
    }
    public static long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int m = 0;
        for(int v : sorted) {
            if(m == 0 || sorted[m - 1] != v) {
                sorted[m++] = v;
            }
        }
        int[] values = Arrays.copyOf(sorted, m);
        int[] rank = new int[n];
        for(int i = 0; i < n; i++) {
            rank[i] = Arrays.binarySearch(values, nums[i]) + 1;
        }
        Fenwick ft = new Fenwick(m);
        long[] cost = new long[n - x + 1];
        long totalSum = 0;
        for(int i = 0; i < x; i++) {
            ft.add(rank[i], 1, nums[i]);
            totalSum += nums[i];
        }
        for(int start = 0; start <= n - x; start++) {
            int medianIndex = ft.findKth((x + 1) / 2);
            long median = values[medianIndex - 1];
            long leftCount = ft.queryCount(medianIndex);
            long leftSum = ft.querySum(medianIndex);
            long rightCount = x - leftCount;
            long rightSum = totalSum - leftSum;
            cost[start] = median * leftCount - leftSum + rightSum - median * rightCount;
            if(start < n - x) {
                ft.add(rank[start], -1, -nums[start]);
                ft.add(rank[start + x], 1, nums[start + x]);
                totalSum += (long) nums[start + x] - nums[start];
            }
        }
        long INF = Long.MAX_VALUE / 4;
        long[][] dp = new long[k + 1][n + 1];
        for(int j = 0; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }
        Arrays.fill(dp[0], 0);
        for(int j = 1; j <= k; j++) {
            for(int i = 1; i <= n; i++) {
                dp[j][i] = dp[j][i - 1];
                if(i >= x && dp[j - 1][i - x] != INF) {
                    dp[j][i] = Math.min(dp[j][i], dp[j - 1][i - x] + cost[i - x]);
                }
            }
        }
        return dp[k][n];
    }
}