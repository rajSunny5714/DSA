package Conditons_Loops_assignment3;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double p = 2*(l+b);
        System.out.println("Perimeter of Rectangle: "+p);
    }
}
