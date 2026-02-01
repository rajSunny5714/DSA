package Conditons_Loops_assignment3;

import java.util.Scanner;

public class NumberOcuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        System.out.print("Target: ");
        int t= sc.nextInt();
        while(n>0){
            int rem = n%10;
            if(rem==t){
                cnt++;
            }
            n=n/10;
        }
        System.out.println("Number Ocuring: "+cnt);
    }
}
