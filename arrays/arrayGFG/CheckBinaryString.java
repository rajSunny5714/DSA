package arrays.arrayGFG;

import java.util.Scanner;

public class CheckBinaryString {
    public static boolean isBinary(String s) {
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != '0' && s.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s = sc.nextLine();
        System.out.println(isBinary(s));
    }
}
