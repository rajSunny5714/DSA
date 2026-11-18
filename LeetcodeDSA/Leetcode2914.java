package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.next();
        System.out.print("Output: "+minChanges(s));
    }
    public static int minChanges(String s) {
        int cnt = 0;
        for(int i=0; i<s.length(); i += 2) {
            if(s.charAt(i) != s.charAt(i+1)) {
                cnt++;
            }
        }
        return cnt;
    }
}
