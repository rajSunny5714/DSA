package Conditons_Loops_assignment3;

import java.util.Scanner;

public class CurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double csa = 2 * Math.PI * r * h;
        System.out.println("Curved Surface Area of Cylinder: "+csa);
    }
}
