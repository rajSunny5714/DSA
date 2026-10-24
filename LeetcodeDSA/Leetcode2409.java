package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode2409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alice's arrival date:");
        String arriveAlice = sc.next();
        System.out.println("Enter Alice's leaving date:");
        String leaveAlice = sc.next();
        System.out.println("Enter Bob's arrival date:");
        String arriveBob = sc.next();
        System.out.println("Enter Bob's leaving date:");
        String leaveBob = sc.next();

        System.out.println("Days spent together: " +countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int st = Math.max(toDays(arriveAlice), toDays(arriveBob));
        int ed = Math.min(toDays(leaveAlice), toDays(leaveBob));
        return Math.max(0, ed-st+1);
    }
    private static int toDays(String date) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));
        for(int i=0; i<month-1; i++) {
            day += days[i];
        }
        return day;
    }
}
