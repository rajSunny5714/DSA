package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class NnumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0, s=0;
        while(i<=n){
            s+=i;
            i++;
        }
        System.out.println("number sum: "+s);
    }
}
