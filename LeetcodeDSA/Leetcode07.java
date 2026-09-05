package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Output: "+reverse(n));
    }
    public static int reverse(int x) {
        long rev = 0;
        while(x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}
