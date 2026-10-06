package LeetcodeDSA;

import java.util.Scanner;

public class Leetcode921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Parenthesis:");
        String str = sc.nextLine();

        System.out.println("Output: "+minAddToMakeValid(str));
    }
    public static int minAddToMakeValid(String s) {
        int open = 0;
        int add = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                open++;
            } else {
                if(open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }
        return add + open;
    }
}
