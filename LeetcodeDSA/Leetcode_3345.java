package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode_3345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(smallestNumber(n, t));
    }
    public static int smallestNumber(int n, int t) {
        while(true) {
            if(digitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }
    }
    private static int digitProduct(int num) {
        int product = 1;
        while(num > 0) {
            product *= (num % 10);
            num /= 10;
        }
        return product;
    }
}
