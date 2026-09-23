package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number in string format: ");
        String str = sc.nextLine();
        System.out.println("Output: "+myAtoi(str));
    }
    public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        long num = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if(sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * num);
    }
}
