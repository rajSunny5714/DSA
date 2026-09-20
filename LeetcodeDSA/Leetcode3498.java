package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine().toLowerCase();
        System.out.println("output: "+reverseDegree(str));
    }
    public static int reverseDegree(String s) {
        int[] value = new int[26];
        for(int i=0; i<26; i++) {
            value[i] = 26 - i;
        }
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            sum += value[s.charAt(i) - 'a'] * (i+1);
        }
        return sum;
    }
}
