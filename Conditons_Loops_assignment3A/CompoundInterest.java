package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P, R, and T: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double ci = p * Math.pow((1 - r/100), t);
        System.out.println("Compound Interest: "+ci);
    }

}
