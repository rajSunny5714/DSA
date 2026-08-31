package Top_75_DSA;

import java.util.Scanner;

public class IsSubsequence392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        System.out.println("Result: "+isSubsequence(str1, str2));
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
