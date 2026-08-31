package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        if(n < 2) {
            System.out.println("Number of nodes must be at least 2.");
            sc.close();
            return;
        }
        ListNode head = null;
        ListNode tail = null;
        System.out.println("Enter " + n + " node values:");
        for(int i=0; i<n; i++) {
            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);
            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int[] result = nodesBetweenCriticalPoints(head);

        System.out.println("Minimum Distance: " + result[0]);
        System.out.println("Maximum Distance: " + result[1]);

        System.out.println("Answer: [" + result[0] + ", " + result[1] + "]");
    }
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int firstCr = -1;
        int prevCr = -1;
        int minDis = Integer.MAX_VALUE;
        int maxDis = -1;
        while(curr != null && curr.next != null) {
            ListNode next = curr.next;
            boolean isMax = curr.val > prev.val && curr.val > next.val;
            boolean isMin = curr.val < prev.val && curr.val < next.val;
            if(isMax || isMin) {
                if(firstCr == -1) {
                    firstCr = index;
                } else {
                    minDis = Math.min(minDis, index - prevCr);
                    maxDis = index - firstCr;
                }
                prevCr = index;
            }
            prev = curr;
            curr = next;
            index++;
        }
        if(maxDis == -1) {
            return new int[]{-1, -1};
        }
        return new int[]{minDis, maxDis};
    }
}
