package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode createList(int[] arr) {
        ListNode head = null;
        ListNode tail = null;
        for(int value : arr) {
            ListNode node = new ListNode(value);
            if(head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while(l1!=null || l2!=null) {
            int a = (l1!=null) ? l1.val : 0;
            int b = (l2!=null) ? l2.val : 0;
            int sum = a + b + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            if(head==null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            if(l1!=null) {
                l1 = l1.next;
            }
            if(l2!=null) {
                l2 = l2.next;
            }
        }
        if(carry!=0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st ListNode: ");
        int s1 = sc.nextInt();
        System.out.print("Enter size of 2nd ListNode: ");
        int s2 = sc.nextInt();
        int[] l1 = new int[s1];
        int[] l2 = new int[s2];
        System.out.println("Enter the node of l1 and l2 respectively:");
        for(int i=0; i<s1; i++){
           l1[i] = sc.nextInt();
        }
        for(int i=0; i<s2; i++){
            l2[i] = sc.nextInt();
        }
        ListNode list1 = createList(l1);
        ListNode list2 = createList(l2);

        ListNode result = addTwoNumbers(list1, list2);
        System.out.print("Output: ");
        printList(result);
    }
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);
            if(head.next != null) {
                System.out.print(" ");
            }
            head = head.next;
        }
    }
}
