package Top_75_DSA;

import java.util.*;
public class Leetcode933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of calls: ");
        int n = sc.nextInt();
        System.out.println("Enter timestamps:");
        for(int i=0; i<n; i++) {
            int t = sc.nextInt();
            System.out.print(ping(t)+" ");
        }
    }
    static Queue<Integer> q = new LinkedList<>();
//    public RecentCounter() {
//    }
    public static int ping(int t) {
        q.add(t);
        while(q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
