package Conditons_Loops_assignment3;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area of equilateral triangle: "+area);
    }
}
