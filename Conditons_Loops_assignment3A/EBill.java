package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class EBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        double units = sc.nextDouble();
        System.out.print("Enter per unit charge: ");
        double charge = sc.nextDouble();
        double totalBill = units * charge;
        System.out.println("Total Electricity Bill: ₹ "+totalBill);
    }
}