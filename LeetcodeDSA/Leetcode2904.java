package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode2904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String str = sc.next();
        System.out.print("Enter the target value: ");
        int t = sc.nextInt();
        System.out.print("Result: "+shortestBeautifulSubstring(str, t));
    }
    public static String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int ones = 0;
        String ans = "";
        for(int right = 0; right < s.length(); right++) {
            if(s.charAt(right) == '1') {
                ones++;
            }
            while(ones > k) {
                if(s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }
            if(ones == k) {
                while(left <= right && s.charAt(left) == '0') {
                    left++;
                }
                String curr = s.substring(left, right + 1);

                if(ans.equals("") || curr.length() < ans.length() || (curr.length() == ans.length() && curr.compareTo(ans) < 0)) {
                    ans = curr;
                }
            }
        }
        return ans;
    }
}
