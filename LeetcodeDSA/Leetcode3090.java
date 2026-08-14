package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode3090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(maximumLengthSubstring(s));
    }
    public static int maximumLengthSubstring(String s) {
        int max = 0;
        for(int i=0; i<s.length(); i++) {
            int[] freq = new int[26];
            for(int j=i; j<s.length(); j++) {
                freq[s.charAt(j)-'a']++;
                if(freq[s.charAt(j)-'a'] > 2) {
                    break;
                }
                max = Math.max(max, j-i+1);
            }
        }
        return max;
    }
}
