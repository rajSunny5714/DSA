package Conditons_Loops_assignment3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height: ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int a = (b*h)/2;
        System.out.println("Area of Triangle: "+a);
    }
}
