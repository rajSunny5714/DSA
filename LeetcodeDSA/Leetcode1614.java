package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode1614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string that hold parenthesis like this - (): ");
        String str = sc.nextLine();
        System.out.println("Output: "+maxDepth(str));
    }
    public static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if(ch == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}
