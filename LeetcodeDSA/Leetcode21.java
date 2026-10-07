package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode21 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first sorted list:");
        String[] a = sc.nextLine().split(" ");

        System.out.println("Enter second sorted list:");
        String[] b = sc.nextLine().split(" ");

        ListNode list1 = createList(a);
        ListNode list2 = createList(b);

        ListNode result = mergeTwoLists(list1, list2);

        printList(result);
    }
    public static ListNode createList(String[] arr) {
        if (arr.length == 0 || arr[0].isEmpty())
            return null;

        ListNode head = new ListNode(Integer.parseInt(arr[0]));
        ListNode current = head;

        for(int i = 1; i < arr.length; i++) {
            current.next = new ListNode(Integer.parseInt(arr[i]));
            current = current.next;
        }

        return head;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode head;
        if(list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        ListNode current = head;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 != null ? list1 : list2;
        return head;
    }
    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            if(head.next != null)
                System.out.print(" ");
            head = head.next;
        }
    }
}
