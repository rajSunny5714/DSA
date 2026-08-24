package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode1927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num as it taken by string: ");
        String n = sc.next();

        System.out.println("Result: "+sumGame(n));
    }
    public static boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;
        for(int i=0; i<n/2; i++) {
            char ch = num.charAt(i);
            if(ch == '?') {
                leftQ++;
            }
            else {
                leftSum += ch - '0';
            }
        }
        for(int i=n/2; i<n; i++) {
            char ch = num.charAt(i);
            if(ch == '?') {
                rightQ++;
            }
            else {
                rightSum += ch - '0';
            }
        }
        if((leftQ + rightQ) % 2 == 1) {
            return true;
        }
        int diff = leftSum - rightSum;
        return diff != (rightQ - leftQ) / 2 * 9;
    }
}
