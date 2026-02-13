package Conditons_Loops_assignment3;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate (%): ");
        double r = sc.nextDouble() / 100;

        System.out.print("Enter Time (years): ");
        int t = sc.nextInt();

        double simpleFV = P * (1 + r * t);
        double compoundFV = P * Math.pow(1 + r, t);
        System.out.println("Simple Interest Future Value = " + simpleFV);
        System.out.println("Compound Interest Future Value = " + compoundFV);
    }
}
