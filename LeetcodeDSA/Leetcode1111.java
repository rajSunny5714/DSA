package LeetcodeDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode1111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parenthesis:");
        String str = sc.nextLine();
        System.out.println("Output: "+Arrays.toString(maxDepthAfterSplit(str)));
    }
    public static int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        int depth = 0;
        for(int i=0; i<seq.length(); i++) {
            if(seq.charAt(i) == '(') {
                depth++;
                ans[i] = depth%2;
            } else {
                ans[i] = depth%2;
                depth--;
            }
        }
        return ans;
    }
}
