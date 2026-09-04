package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word or sentence:");
        String str = sc.nextLine();
        System.out.println("Output: "+lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' ') {
            i--;
        }
        int cnt = 0;
        while(i>=0 && s.charAt(i)!=' ') {
            cnt++;
            i--;
        }
        return cnt;
    }
}
