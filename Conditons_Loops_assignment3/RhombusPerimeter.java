package Conditons_Loops_assignment3;

import java.util.Scanner;

public class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of Rhombus: " +perimeter);
    }
}
