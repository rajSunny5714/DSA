package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        char[] chars = s.toCharArray();
        int length = compress(chars);
        System.out.println("Output: "+length);
    }
    public static int compress(char[] chars) {
        int i = 0;
        int idx = 0;
        while(i < chars.length) {
            char current = chars[i];
            int cnt = 0;
            while(i < chars.length && chars[i] == current) {
                i++;
                cnt++;
            }
            chars[idx++] = current;
            if(cnt > 1) {
                String str = String.valueOf(cnt);
                for(char ch : str.toCharArray()) {
                    chars[idx++] = ch;
                }
            }
        }
        return idx;
    }
}
