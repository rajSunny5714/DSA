package LeetcodeDSA;

import java.util.*;

public class Leetcode3970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();

        int[][] ed = new int[m][3];
        System.out.println("Enter edges (source destination weight):");
        for(int i=0; i<m; i++) {
            ed[i][0] = sc.nextInt();
            ed[i][1] = sc.nextInt();
            ed[i][2] = sc.nextInt();
        }
        System.out.print("Enter labels string: ");
        String lb = sc.next();
        System.out.print("Enter maximum consecutive identical characters (k): ");
        int k = sc.nextInt();

        int res = shortestPath(n, ed, lb, k);
        System.out.println("Shortest path cost: "+res);
    }
    public static int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }
        int[][] dist = new int[n][k + 1];
        for(int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[0], b[0])
        );
        dist[0][1] = 0;
        pq.offer(new int[]{0, 0, 1});
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int node = curr[1];
            int count = curr[2];
            if(cost != dist[node][count]) {
                continue;
            }
            if(node == n-1) {
                return cost;
            }
            for(int[] edge : graph[node]) {
                int next = edge[0];
                int weight = edge[1];
                int nextCount;
                if(labels.charAt(next) == labels.charAt(node)) {
                    nextCount = count+1;
                } else {
                    nextCount = 1;
                }
                if(nextCount>k) {
                    continue;
                }
                int newCost = cost + weight;
                if(newCost < dist[next][nextCount]) {
                    dist[next][nextCount] = newCost;
                    pq.offer(new int[]{newCost, next, nextCount});
                }
            }
        }
        return -1;
    }
}
