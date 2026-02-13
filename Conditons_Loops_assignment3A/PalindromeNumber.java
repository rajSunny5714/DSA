package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int or = n;
        int ans=0;
        while(n>0) {
            int rem = n%10;
            ans = ans*10+rem;
            n=n/10;
        }
        if(ans==or)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}
