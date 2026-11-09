package LeetcodeDSA;

import java.util.*;

public class LeetCode_1606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of servers: ");
        int k = sc.nextInt();
        System.out.print("Enter number of requests: ");
        int n = sc.nextInt();

        int[] arrival = new int[n];
        int[] load = new int[n];

        System.out.println("Enter arrival times:");
        for(int i=0; i<n; i++) {
            arrival[i] = sc.nextInt();
        }
        System.out.println("Enter load times:");
        for(int i=0; i<n; i++) {
            load[i] = sc.nextInt();
        }
        List<Integer> result = busiestServers(k, arrival, load);
        System.out.println("Busiest Servers: "+result);
    }
    public static List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> available = new TreeSet<>();
        for(int i=0; i<k; i++) {
            available.add(i);
        }
        PriorityQueue<int[]> busy = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[0], b[0])
        );
        int[] cnt = new int[k];
        for(int i=0; i<arrival.length; i++) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                available.add(busy.poll()[1]);
            }
            if(available.isEmpty()) {
                continue;
            }
            int server = i % k;
            Integer assigned = available.ceiling(server);
            if(assigned == null) {
                assigned = available.first();
            }
            available.remove(assigned);

            cnt[assigned]++;
            busy.offer(new int[] {
                    arrival[i] + load[i],
                    assigned
            });
        }
        int max = 0;
        for(int c : cnt) {
            max = Math.max(max, c);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<k; i++) {
            if(cnt[i]==max) {
                result.add(i);
            }
        }
        return result;
    }
}