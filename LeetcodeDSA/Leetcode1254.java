package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];
        System.out.println("Enter grid elements (0 or 1):");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("Number of closed islands: " +closedIsland(grid));
    }
    public static int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] parent = new int[m * n];
        int[] rank = new int[m * n];
        boolean[] boundary = new boolean[m * n];
        for(int i = 0; i < m * n; i++) {
            parent[i] = i;
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1)
                    continue;
                int id = i * n + j;
                if(i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    boundary[id] = true;
                }
                if(i > 0 && grid[i - 1][j] == 0) {
                    union(id, (i - 1) * n + j, parent, rank, boundary);
                }
                if(j > 0 && grid[i][j - 1] == 0) {
                    union(id, i * n + j - 1, parent, rank, boundary);
                }
            }
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) {
                    int root = find(i * n + j, parent);
                    if(!boundary[root]) {
                        count++;
                        boundary[root] = true;
                    }
                }
            }
        }
        return count;
    }
    private static int find(int x, int[] parent) {
        if(parent[x] != x) {
            parent[x] = find(parent[x], parent);
        }
        return parent[x];
    }
    private static void union(int a, int b, int[] parent, int[] rank, boolean[] boundary) {
        int rootA = find(a, parent);
        int rootB = find(b, parent);
        if(rootA == rootB)
            return;

        if(rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
            boundary[rootB] |= boundary[rootA];
        } else if(rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
            boundary[rootA] |= boundary[rootB];
        } else {
            parent[rootB] = rootA;
            rank[rootA]++;
            boundary[rootA] |= boundary[rootB];
        }
    }
}
