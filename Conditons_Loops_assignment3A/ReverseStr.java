package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";
        for(int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: "+rev);
    }
}
