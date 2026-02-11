package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product actual price: ");
        double p = sc.nextDouble();
        System.out.print("Enter discount % of the product: ");
        double d = sc.nextDouble();
        double dp = p*d/100;
        double finalPrice = p-dp;
        System.out.println("Discount Amount: ₹" +dp);
        System.out.println("Final Price after Discount: ₹" +finalPrice);
    }
}
