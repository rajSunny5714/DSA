package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Output: "+countAndSay(n));
    }
    public static String countAndSay(int n) {
        String res = "1";
        for(int i=2; i<= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1; j<=res.length(); j++) {
                if(j<res.length() && res.charAt(j) == res.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(res.charAt(j - 1));
                    count = 1;
                }
            }
            res = sb.toString();
        }
        return res;
    }
}
