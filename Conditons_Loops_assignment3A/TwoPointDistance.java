package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class TwoPointDistance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first point (x y): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter second point (x y): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double distance = Math.sqrt(dx*dx + dy*dy);
        System.out.println("Distance between two points: " + distance);
    }
}
