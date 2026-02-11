package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Actual Amount: ");
        double amt = sc.nextDouble();
        System.out.print("Enter Commission Amount: ");
        double cAmt = sc.nextDouble();
        double cPercent = cAmt*100/amt;
        System.out.println("Commission Percentage: "+cPercent+"%");
    }
}
