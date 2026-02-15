package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        while(n>0) {
            int rem = n%10;
            s+=rem;
            n/=10;
        }
        System.out.println("number Sum: "+s);
    }
}
